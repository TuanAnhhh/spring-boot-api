package com.example.springbootapi.controller;

import com.example.springbootapi.entity.Employee;
import com.example.springbootapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> index (){
        return employeeService.getEmployees();
    }
    @GetMapping("/{id}")
    public Employee getOne (@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public boolean post(@RequestBody Employee e){
        return employeeService.createEmployee(e);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
