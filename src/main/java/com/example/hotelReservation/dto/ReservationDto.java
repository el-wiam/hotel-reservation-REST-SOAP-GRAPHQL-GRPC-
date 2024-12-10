package com.example.hotelReservation.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@Data
@Builder
//@NoArgsConstructor
public class ReservationDto {
    private Long id;           // main field
    private String client;
    private int chambre;
    //@XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate dateDebut;
    //@XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate dateFin;
    private String preference;

    // If you need to set a default value for 'id', you can do it directly in the constructor or elsewhere
}
