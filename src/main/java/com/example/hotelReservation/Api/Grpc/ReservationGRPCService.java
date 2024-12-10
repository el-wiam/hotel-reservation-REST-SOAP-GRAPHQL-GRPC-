package com.example.hotelReservation.Api.Grpc;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.Grpc.generated.*;
import com.example.hotelReservation.services.ReservationService;
import jakarta.persistence.NoResultException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@GrpcService
@RequiredArgsConstructor
public class ReservationGRPCService extends ReservationServiceGrpc.ReservationServiceImplBase {


    @NonNull
    private final ReservationService reservationService;
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public void getAllReservations(Empty request, StreamObserver<ReservationList> responseObserver) {
        try {
            System.out.println("Handling getAllReservations via gRPC request.");
            var reservations = reservationService.getAllReservations();

            // Convert reservations to Protos
            var reservationProtos = reservations.stream()
                    .map(this::toReservationProto)
                    .toList();

            var response = ReservationList.newBuilder()
                    .addAllReservations(reservationProtos)
                    .build();

            // Send response to client
            responseObserver.onNext(response);
            responseObserver.onCompleted();

            System.out.println("getAllReservations - gRPC request: Successfully retrieved all reservations.");
        } catch (Exception e) {
            System.out.println("getAllReservations - gRPC request: Error while retrieving reservations. " + e.getMessage());
            responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void getReservationById(ReservationId request, StreamObserver<ReservationResponse> responseObserver) {
        try {
            System.out.println("Handling getReservationById via gRPC request for ID: " + request.getId());
            var reservationDto = reservationService.getReservationById(request.getId());
            responseObserver.onNext(toReservationProto(reservationDto));
            responseObserver.onCompleted();

            System.out.println("getReservationById - gRPC request: Successfully retrieved reservation for ID: " + request.getId());
        } catch (NoResultException e) {
            System.out.println("getReservationById - gRPC request: Reservation with ID " + request.getId() + " not found.");
            responseObserver.onError(Status.NOT_FOUND.withDescription(e.getMessage()).asRuntimeException());
        }
    }


    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        try {
            System.out.println("Handling createReservation via gRPC request.");
            ReservationDto reservationDto = reservationService.saveReservation(fromReservationRequest(request));
            responseObserver.onNext(toReservationProto(reservationDto));
            responseObserver.onCompleted();

            System.out.println("createReservation - gRPC request: Successfully created a new reservation.");
        } catch (Exception e) {
            System.out.println("createReservation - gRPC request: Error while creating a new reservation. " + e.getMessage());
            responseObserver.onError(Status.INTERNAL.withDescription(e.getMessage()).asRuntimeException());
        }
    }


    private ReservationResponse toReservationProto(ReservationDto reservationDto) {
        return ReservationResponse.newBuilder()
                .setId(reservationDto.getId())
                .setGuestName(reservationDto.getClient())
                .setRoomNumber(reservationDto.getChambre())
                .setStartDate(reservationDto.getDateDebut().format(DATE_FORMATTER))
                .setEndDate(reservationDto.getDateFin().format(DATE_FORMATTER))
                .setPreference(reservationDto.getPreference())
                .build();
    }


    private ReservationDto fromReservationRequest(ReservationRequest request) {
        return ReservationDto.builder()
                .id(request.getId() == 0 ? null : request.getId())
                .client(request.getGuestName())
                .chambre(request.getRoomNumber()) // Ensure parsing matches type
                .dateDebut(LocalDate.parse(request.getStartDate(), DATE_FORMATTER))
                .dateFin(LocalDate.parse(request.getEndDate(), DATE_FORMATTER))
                .preference(request.getPreference())
                .build();
    }
}
