package com.gatodev.fitness.controllers;

import com.gatodev.fitness.entities.Area;
import com.gatodev.fitness.services.AreaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/area")
public class AreaController {

    private final AreaService areaService;

    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping
    public ResponseEntity<?> getAllAreas() {
        return ResponseEntity.ok(areaService.getAreas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAreaById(@PathVariable Long id) {
        return ResponseEntity.ok(areaService.getArea(id));
    }

    @PostMapping
    public ResponseEntity<?> addArea(@RequestBody Area area) {
        return ResponseEntity.ok(areaService.addArea(area));
    }

    @PutMapping
    public ResponseEntity<?> updateArea(@RequestBody Area area) {
        return ResponseEntity.ok(areaService.updateArea(area));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteArea(@PathVariable Long id) {
        areaService.deleteArea(id);
        return ResponseEntity.ok("Área eliminada correctamente");
    }
}
