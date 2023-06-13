package com.example.spring_mvc.controller;


import com.example.spring_mvc.model.Employee;
import com.example.spring_mvc.service.EmployeeServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/total")
    public ResponseEntity<Integer> totalSalary() {
        return ResponseEntity.ok(employeeService.getTotalSalary());
    }

    @GetMapping("/min")
    public ResponseEntity<Employee> minSalary() {
        return ResponseEntity.ok(employeeService.getMinSalaryEmployee());
    }

    @GetMapping("/max")
    public ResponseEntity<Employee> maxSalary() {
        return ResponseEntity.ok(employeeService.getMaxSalaryEmployee());
    }

    @GetMapping("/highSalary")
    public ResponseEntity<List<Employee>> highSalary() {
        return ResponseEntity.ok(employeeService.getHighSalaryEmployees());
    }
}
