package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Area;
import com.gatodev.fitness.repositories.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {
    private final AreaRepository areaRepository;

    @Override
    public void run(String... args) throws Exception {
        createAreaIfNotExists( "Área de Ventas");
        createAreaIfNotExists( "Área de Entrenadores");
        createAreaIfNotExists( "Área de Operaciones");
        createAreaIfNotExists( "Atención al Cliente");
    }

    private void createAreaIfNotExists(String areaName) {
        if (!areaRepository.existsByName(areaName)) {
            areaRepository.save(new Area(null, areaName));
        }
    }
}
