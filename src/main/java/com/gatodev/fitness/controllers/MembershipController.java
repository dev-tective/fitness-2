package com.gatodev.fitness.controllers;

import com.gatodev.fitness.entities.Membership;
import com.gatodev.fitness.services.MembershipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/membership")
public class MembershipController {

    private final MembershipService membershipService;

    public MembershipController(MembershipService membershipService) {
        this.membershipService = membershipService;
    }

    @GetMapping
    public ResponseEntity<?> getAllMemberships() {
        return ResponseEntity.ok(membershipService.getMemberships());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMembershipById(@PathVariable Long id) {
        return ResponseEntity.ok(membershipService.getMembership(id));
    }

    @PostMapping
    public ResponseEntity<?> addMembership(@RequestBody Membership membership) {
        return ResponseEntity.ok(membershipService.addMembership(membership));
    }

    @PutMapping
    public ResponseEntity<?> updateMembership(@RequestBody Membership membership) {
        return ResponseEntity.ok(membershipService.updateMembership(membership));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMembership(@PathVariable Long id) {
        membershipService.deleteMembership(id);
        return ResponseEntity.ok("Membresía eliminada correctamente");
    }
}
