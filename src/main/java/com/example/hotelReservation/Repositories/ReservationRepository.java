package com.example.hotelReservation.Repositories;

import com.example.hotelReservation.Entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findByClient(String client);

    List<Reservation> findByChambre(int chambre);

}
