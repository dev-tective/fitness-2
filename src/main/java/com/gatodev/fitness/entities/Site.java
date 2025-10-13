package com.gatodev.fitness.entities;

import com.gatodev.fitness.enums.SiteType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SiteType type;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private LocalTime opening;

    @Column(nullable = false)
    private LocalTime closing;

    @Column(nullable = false)
    private Integer capacity;

    private boolean active;
}
