package dev.springbootpetshopapplication.Service;

import dev.springbootpetshopapplication.Models.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);
}
