package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Area;
import java.util.List;

public interface AreaService {
    Area addArea(Area area);

    Area updateArea(Area area);

    Area getArea(Long id);

    void deleteArea(Long id);

    List<Area> getAreas();
}
