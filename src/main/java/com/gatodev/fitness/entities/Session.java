package com.gatodev.fitness.entities;

import com.gatodev.fitness.enums.SessionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private SessionType sessionType;

    private LocalDateTime start;

    private LocalDateTime end;

    private Integer maxParticipants;

    private String sessionReport;

    @ManyToOne
    private Training training;

    @ManyToOne
    private Employee trainer;

    @ManyToOne
    private Site site;
}
