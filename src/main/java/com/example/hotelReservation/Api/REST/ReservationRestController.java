package com.example.hotelReservation.Api.REST;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.services.ReservationService;
import jakarta.persistence.NoResultException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(produces = "application/json", value = "/api/reservations")
@RequiredArgsConstructor
public class ReservationRestController {

    @NonNull private final ReservationService reservationService;

    @GetMapping
    public ResponseEntity<List<ReservationDto>> getReservations() throws Exception {
        System.out.println("getReservations - REST request: Getting all reservations");
        var reservations = reservationService.getAllReservations();
        return ResponseEntity.ok(reservations);
    }


    @GetMapping("/{id}")
    public ResponseEntity<ReservationDto> getReservationById(@PathVariable Long id) throws IllegalArgumentException {
        System.out.println("getReservationById - REST request: Getting reservation by ID: " + id);
        var reservation = reservationService.getReservationById(id);
        return ResponseEntity.ok(reservation);
    }


    @GetMapping("/search")
    public ResponseEntity<List<ReservationDto>> searchReservationsByClient(@RequestParam String client) throws NoResultException {
        System.out.println("searchReservationsByClient - REST request: Getting reservations by client name: " + client);
        var reservations = reservationService.getReservationsByClient(client);
        return ResponseEntity.ok(reservations);
    }


    @PostMapping
    public ResponseEntity<ReservationDto> saveReservation(@RequestBody ReservationDto reservationDto) throws Exception {
        System.out.println("saveReservation - REST request: Saving new reservation: " + reservationDto);
        var createdReservation = reservationService.saveReservation(reservationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReservation);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ReservationDto> updateReservation(
            @PathVariable("id") Long reservationId,
            @RequestBody ReservationDto reservationDto) throws Exception {
        System.out.println("updateReservation - REST request: Updating reservation with ID: " + reservationId + " - New data: " + reservationDto);
        var updatedReservation = reservationService.updateReservation(reservationId, reservationDto);
        return ResponseEntity.ok(updatedReservation);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteReservation(@PathVariable("id") Long reservationId) throws Exception {
        System.out.println("deleteReservation - REST request: Deleting reservation with ID: " + reservationId);
        reservationService.deleteReservation(reservationId);
        return ResponseEntity.ok("Reservation successfully deleted.");
    }
}
