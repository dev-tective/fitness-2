package com.gatodev.fitness.controllers;

import com.gatodev.fitness.entities.Client;
import com.gatodev.fitness.services.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<?> createClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.addClient(client));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClient(@PathVariable UUID id) {
        return ResponseEntity.ok(clientService.getClientById(id));
    }

    @PutMapping
    public ResponseEntity<?> updateClient(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.updateClient(client));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable UUID id) {
        clientService.deleteClientById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<?> getClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }
}
