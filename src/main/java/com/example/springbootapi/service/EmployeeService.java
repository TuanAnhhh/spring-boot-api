package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    boolean createEmployee(Employee e);
    Employee getEmployeeById(Long id);
    List<Employee> getEmployees();
    boolean deleteEmployee(Long id);
}
