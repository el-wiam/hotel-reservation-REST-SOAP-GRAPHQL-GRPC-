

package com.example.hotelReservation.Api.Soap;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.services.ReservationService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
@WebService(serviceName = "ReservationWS")
public class ReservationSoapService {


    @NonNull private final ReservationService reservationService;


    @WebMethod
    public List<com.example.hotelReservation.dto.ReservationDto> getAllReservations() throws Exception {
        return reservationService.getAllReservations();
    }


    @WebMethod
    public com.example.hotelReservation.dto.ReservationDto reservationById(@WebParam(name = "id") Long reservationId) {
        return reservationService.getReservationById(reservationId);
    }

    @WebMethod
    public ReservationDto saveReservation(@WebParam(name = "reservation") ReservationDto reservationDto) throws Exception {
        return reservationService.saveReservation(reservationDto);
    }
}

