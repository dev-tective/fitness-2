package com.gatodev.fitness.models;

import com.gatodev.fitness.entities.User;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginResponse {
    private String token;
    private User user;
}
