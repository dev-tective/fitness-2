package com.gatodev.fitness.services.impl;

import com.gatodev.fitness.entities.Reservation;
import com.gatodev.fitness.repositories.ReservationRepository;
import com.gatodev.fitness.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> getReservationsByClientId(UUID clientId) {
        return reservationRepository.findAllByClientId(clientId);
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
