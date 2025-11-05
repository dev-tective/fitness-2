package com.gatodev.fitness.controllers;

import com.gatodev.fitness.entities.Sanction;
import com.gatodev.fitness.services.SanctionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sanction")
public class SanctionController {

    private final SanctionService sanctionService;

    public SanctionController(SanctionService sanctionService) {
        this.sanctionService = sanctionService;
    }

    @GetMapping
    public ResponseEntity<?> getAllSanctions() {
        return ResponseEntity.ok(sanctionService.getSanctions());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSanctionById(@PathVariable Long id) {
        return ResponseEntity.ok(sanctionService.getSanction(id));
    }

    @PostMapping
    public ResponseEntity<?> addSanction(@RequestBody Sanction sanction) {
        return ResponseEntity.ok(sanctionService.addSanction(sanction));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateSanction(@RequestBody Sanction sanction) {
        return ResponseEntity.ok(sanctionService.updateSanction(sanction));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSanction(@PathVariable Long id) {
        sanctionService.deleteSanction(id);
        return ResponseEntity.ok("Sanción eliminada correctamente");
    }
}
