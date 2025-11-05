package com.gatodev.fitness.services.impl;

import com.gatodev.fitness.entities.Employee;
import com.gatodev.fitness.entities.User;
import com.gatodev.fitness.enums.Rol;
import com.gatodev.fitness.repositories.EmployeeRepository;
import com.gatodev.fitness.repositories.UserRepository;
import com.gatodev.fitness.services.EmployeeService;
import com.gatodev.fitness.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final UserService userService;

    @Override
    public Employee addEmployee(Employee employee) {
        String email = employee.getDni() + "@mail.com";
        String password = UUID.randomUUID().toString();
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setActive(true);
        user.setRole(Rol.EMPLOYEE);
        employee.setUser(userService.addUser(user));
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(UUID id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee with id " + id + " not found"));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
