package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Sanction;

import java.util.List;

public interface SanctionService {
    Sanction addSanction(Sanction sanction);

    Sanction updateSanction(Sanction sanction);

    Sanction getSanction(Long id);

    void deleteSanction(Long id);

    List<Sanction> getSanctions();

}