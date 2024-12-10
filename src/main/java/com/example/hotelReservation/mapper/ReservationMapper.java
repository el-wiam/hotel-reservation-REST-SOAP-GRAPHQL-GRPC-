package com.example.hotelReservation.mapper;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.hotelReservation.dto.ReservationDto;
import com.example.hotelReservation.Entities.Reservation;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationDto toDto(Reservation reservation);

    Reservation toEntity(ReservationDto reservationDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateReservationFromDto(ReservationDto reservationDto, @MappingTarget Reservation reservation);
    List<ReservationDto> toReservationDtoList(List<Reservation> reservations);
    List<Reservation> toReservationList(List<ReservationDto> reservationDtos);
}


