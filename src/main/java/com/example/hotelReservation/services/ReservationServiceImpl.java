package com.example.hotelReservation.services;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.mapper.ReservationMapper;
import com.example.hotelReservation.Repositories.ReservationRepository;
import jakarta.persistence.NoResultException;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    @NonNull private final ReservationRepository reservationRepository;

    @NonNull private final ReservationMapper reservationMapper;

    @NonNull private final Validator validator;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ReservationDto> getAllReservations() throws Exception {
        System.out.println("#### Getting all reservations ####");
        var reservations = reservationRepository.findAll();
        if (reservations.isEmpty()) {
            System.out.println("No reservations found");
            throw new NoResultException("No reservations found");
        }
        System.out.println("Retrieved " + reservations.size() + " reservations");
        return reservationMapper.toReservationDtoList(reservations);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationDto getReservationById(Long reservationId) {
        System.out.println("#### Getting reservation by ID: " + reservationId + " ####");
        var reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> {
                    System.out.println("Reservation with ID " + reservationId + " not found");
                    return new IllegalArgumentException("Reservation with ID " + reservationId + " not found");
                });
        System.out.println("Retrieved reservation: " + reservation);
        return reservationMapper.toDto(reservation);
    }

    @Transactional
    @Override
    public ReservationDto saveReservation(ReservationDto reservationDto) throws Exception {
        System.out.println("#### Saving new reservation: " + reservationDto + " ####");
        var violations = validator.validate(reservationDto);
        if (!violations.isEmpty()) {
            System.out.println("Validation failed for reservation: " + reservationDto);
            throw new ConstraintViolationException(violations);
        }
        var reservation = reservationMapper.toEntity(reservationDto);
        reservation = reservationRepository.save(reservation);
        System.out.println("Saved reservation: " + reservation);
        return reservationMapper.toDto(reservation);
    }

    @Override
    public List<ReservationDto> getReservationsByClient(String client) throws NoResultException {
        System.out.println("#### Getting reservations by client: " + client + " ####");
        var reservations = reservationRepository.findByClient(client);
        if (reservations.isEmpty()) {
            System.out.println("No reservations found for client: " + client);
            throw new NoResultException("No reservations found for client: " + client);
        }
        System.out.println("Retrieved " + reservations.size() + " reservations for client: " + client);
        return reservationMapper.toReservationDtoList(reservations);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationDto updateReservation(Long reservationId, ReservationDto reservationDto) throws Exception {
        System.out.println("#### Updating reservation with ID: " + reservationId + " - New data: " + reservationDto + " ####");
        var reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> {
                    System.out.println("Reservation with ID " + reservationId + " not found for update");
                    return new IllegalArgumentException("Reservation with ID " + reservationId + " not found for update");
                });
        reservationMapper.updateReservationFromDto(reservationDto, reservation);
        var violations = validator.validate(reservation);
        if (!violations.isEmpty()) {
            System.out.println("Validation failed for updated reservation: " + reservation);
            throw new ConstraintViolationException(violations);
        }
        reservation = reservationRepository.save(reservation);
        System.out.println("Updated reservation: " + reservation);
        return reservationMapper.toDto(reservation);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public void deleteReservation(Long reservationId) throws Exception {
        System.out.println("#### Deleting reservation with ID: " + reservationId + " ####");
        var reservation = reservationRepository.findById(reservationId)
                .orElseThrow(() -> {
                    System.out.println("Reservation with ID " + reservationId + " not found for deletion");
                    return new IllegalArgumentException("Reservation with ID " + reservationId + " not found for deletion");
                });
        reservationRepository.delete(reservation);
        System.out.println("Deleted reservation: " + reservation);
    }
}
