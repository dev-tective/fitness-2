package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User updateUser(User user);
    User getUser(Long id);
    void deleteUser(Long id);
    List<User> getUsers();
}
