package com.example.springbootapi.service;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public boolean createEmployee(Employee e) {
        try {
            employeeRepository.save(e);
            return true;
        }catch (Exception exception){
            return false;
        }
    }
    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getById(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception exception){
            return false;
        }
    }
}
