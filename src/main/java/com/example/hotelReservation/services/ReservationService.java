package com.example.hotelReservation.services;

import com.example.hotelReservation.dto.ReservationDto;
import jakarta.persistence.NoResultException;

import java.util.List;

public interface ReservationService {

    List<ReservationDto> getAllReservations() throws Exception;

    ReservationDto getReservationById(Long reservationId);

    ReservationDto saveReservation(ReservationDto reservationDto) throws Exception;

    List<ReservationDto> getReservationsByClient(String client) throws NoResultException;

    ReservationDto updateReservation(Long reservationId, ReservationDto reservationDto) throws Exception;

    void deleteReservation(Long reservationId) throws Exception;


}
