package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Reservation;

import java.util.List;
import java.util.UUID;

public interface ReservationService {
    Reservation addReservation(Reservation reservation);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

    List<Reservation> getReservationsByClientId(UUID clientId);

    List<Reservation> getAllReservations();
}
