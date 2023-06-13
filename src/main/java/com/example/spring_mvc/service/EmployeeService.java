package com.example.spring_mvc.service;

import com.example.spring_mvc.model.Employee;

import java.util.List;

public interface EmployeeService {

    Integer getTotalSalary();

    Employee getMinSalaryEmployee();

    Employee getMaxSalaryEmployee();

    List<Employee> getHighSalaryEmployees();


}
