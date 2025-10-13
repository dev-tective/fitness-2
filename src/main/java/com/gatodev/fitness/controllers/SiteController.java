package com.gatodev.fitness.controllers;

import com.gatodev.fitness.entities.Site;
import com.gatodev.fitness.services.SiteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/site")
public class SiteController {
    private final SiteService siteService;

    public SiteController(SiteService siteService) {
        this.siteService = siteService;
    }

    @GetMapping
    public ResponseEntity<?> getAllSites() {
        return ResponseEntity.ok(siteService.getSites());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSiteById(@PathVariable Long id) {
        return ResponseEntity.ok(siteService.getSite(id));
    }

    @PostMapping
    public ResponseEntity<?> addSite(@RequestBody Site site) {
        return ResponseEntity.ok(siteService.addSite(site));
    }

    @PutMapping
    public ResponseEntity<?> updateSite(@RequestBody Site site) {
        return ResponseEntity.ok(siteService.updateSite(site));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSite(@PathVariable Long id) {
        siteService.deleteSite(id);
        return ResponseEntity.ok().build();
    }
}
