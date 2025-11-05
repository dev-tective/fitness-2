package com.gatodev.fitness.entities;

import com.gatodev.fitness.enums.SanctionState;
import com.gatodev.fitness.enums.SanctionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Sanction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate start;

    @Column(nullable = false)
    private LocalDate end;

    private boolean active;

    @Column(nullable = false)
    private SanctionType sanctionType;

    @Column(nullable = false)
    private SanctionState state;


}
