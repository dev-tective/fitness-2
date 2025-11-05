package com.gatodev.fitness.entities;

import com.gatodev.fitness.enums.ReservationState;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ReservationState reservationState;

    @ManyToOne
    private Session session;

   /* Próximamente
    private Client client;*/
}
