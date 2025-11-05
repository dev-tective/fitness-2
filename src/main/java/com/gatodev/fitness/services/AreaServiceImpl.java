package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Area;
import com.gatodev.fitness.repositories.AreaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    private final AreaRepository areaRepository;

    public AreaServiceImpl(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    @Override
    public Area addArea(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Area updateArea(Area area) {
        return areaRepository.save(area);
    }

    @Override
    public Area getArea(Long id) {
        return areaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Área no encontrada"));
    }

    @Override
    public void deleteArea(Long id) {
        areaRepository.findById(id).ifPresentOrElse(
                area -> {
                    area.setActive(false);
                    areaRepository.save(area);
                },
                () -> {
                    throw new RuntimeException("Área no encontrada");
                }
        );
    }

    @Override
    public List<Area> getAreas() {
        return areaRepository.findAll();
    }
}
