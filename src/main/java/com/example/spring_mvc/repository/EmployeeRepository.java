package com.example.spring_mvc.repository;

import com.example.spring_mvc.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    Integer getTotalSalary();

    Employee getMinSalaryEmployee();

    Employee getMaxSalaryEmployee();

    List<Employee> getHighSalaryEmployees();
}
