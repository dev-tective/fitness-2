package com.gatodev.fitness.controllers;

import com.gatodev.fitness.models.LoginRequest;
import com.gatodev.fitness.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        return ResponseEntity.ok(userService.login(
                loginRequest.getEmail(), loginRequest.getPassword()));
    }
}
