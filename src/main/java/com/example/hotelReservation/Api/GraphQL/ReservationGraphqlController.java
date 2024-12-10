package com.example.hotelReservation.Api.GraphQL;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.services.ReservationService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReservationGraphqlController {

    @NonNull
    private final ReservationService reservationService;


    @QueryMapping
    public List<ReservationDto> allReservations() throws Exception {
        return reservationService.getAllReservations();
    }


    @QueryMapping
    public ReservationDto reservationById(@Argument Long id) throws Exception {
        return reservationService.getReservationById(id);
    }


    @QueryMapping
    public List<ReservationDto> reservationsByClient(@Argument String client) throws Exception {
        return reservationService.getReservationsByClient(client);
    }


    @MutationMapping
    public ReservationDto saveReservation(@Argument ReservationDto reservation) throws Exception {
        return reservationService.saveReservation(reservation);
    }


    @MutationMapping
    public ReservationDto updateReservation(@Argument Long id, @Argument ReservationDto reservation) throws Exception {
        return reservationService.updateReservation(id, reservation);
    }

    @MutationMapping
    public void deleteReservation(@Argument Long id) throws Exception {
         reservationService.deleteReservation(id);
    }
}
