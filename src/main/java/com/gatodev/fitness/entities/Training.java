package com.gatodev.fitness.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Duration;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, nullable=false)
    private String name;

    private String description;

    @Column(nullable=false)
    private Duration duration;

    @Column(nullable=false)
    private Integer maxParticipants;

    private boolean active;
}
