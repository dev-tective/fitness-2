package com.gatodev.fitness.repositories;

import com.gatodev.fitness.entities.Sanction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SanctionRepository extends JpaRepository<Sanction,Long> {
}
