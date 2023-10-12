package dev.springbootpetshopapplication.Service;

import dev.springbootpetshopapplication.Models.Employee;
import dev.springbootpetshopapplication.Repository.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDao.save(employee);
    }
}
