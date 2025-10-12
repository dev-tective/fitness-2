package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.User;
import com.gatodev.fitness.enums.Rol;
import com.gatodev.fitness.models.LoginResponse;
import com.gatodev.fitness.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCrypt;
    @Autowired
    private JwtService jwtService;

    @PostConstruct
    public void init() {
        if (userRepository.count() == 0) {
            User user = User.builder()
                    .email("admin@mail.com")
                    .password(bCrypt.encode("admin"))
                    .role(Rol.ADMIN)
                    .build();
            userRepository.save(user);
        }
    }

    @Override
    public User addUser(User user) {
        user.setPassword(bCrypt.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user) {
        if (!userRepository.existsById(user.getId())) {
            throw new RuntimeException("Usuario no encontrado");
        }

        user.setPassword(bCrypt.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public LoginResponse login(String email, String password) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        if (!bCrypt.matches(password, user.getPassword())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        String token = jwtService.generateToken(user);
        return LoginResponse.builder()
                .user(user)
                .token(token)
                .build();
    }
}
