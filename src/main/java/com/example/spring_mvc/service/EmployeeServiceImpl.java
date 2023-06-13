package com.example.spring_mvc.service;

import com.example.spring_mvc.model.Employee;
import com.example.spring_mvc.repository.EmployeeRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepositoryImpl employeeRepository;

    public EmployeeServiceImpl(EmployeeRepositoryImpl employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Integer getTotalSalary() {
        return employeeRepository.getTotalSalary();
    }

    @Override
    public Employee getMinSalaryEmployee() {
        return employeeRepository.getMinSalaryEmployee();
    }

    @Override
    public Employee getMaxSalaryEmployee() {
        return employeeRepository.getMaxSalaryEmployee();
    }

    @Override
    public List<Employee> getHighSalaryEmployees() {
        return employeeRepository.getHighSalaryEmployees();
    }
}
