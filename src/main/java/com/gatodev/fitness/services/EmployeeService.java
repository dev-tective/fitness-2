package com.gatodev.fitness.services;

import com.gatodev.fitness.entities.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    Employee getEmployeeById(UUID id);

    List<Employee> getAllEmployees();
}
