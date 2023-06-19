package com.example.spring_mvc.repository;

import com.example.spring_mvc.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    List<Employee> employeeList = List.of(new Employee("Anna", 25000),
            new Employee("Kirill", 50000),
            new Employee("Dmitriy", 12000),
            new Employee("Konstantin", 35000),
            new Employee("Olga", 22500));


    @Override
    public Integer getTotalSalary() {
        return employeeList.stream().map(Employee::getSalary).reduce(0, Integer::sum);
    }


    @Override
    public Employee getMinSalaryEmployee() {
        return employeeList.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
    }

    @Override
    public Employee getMaxSalaryEmployee() {
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
    }


    @Override
    public List<Employee> getHighSalaryEmployees() {
        int average = getTotalSalary() / employeeList.size();
        return employeeList.stream().filter(employee -> employee.getSalary() > average).collect(Collectors.toList());
    }
}
