
package com.example.hotelReservation.configuration;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hotelReservation.Api.Soap.ReservationSoapService;

@Configuration
public class SOapConfig {

    @Bean
    public EndpointImpl reservationSoapEndpoint(Bus bus, ReservationSoapService reservationSoapService) {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoapService);
        endpoint.publish("/ws/reservations");
        return endpoint;
    }
}
