package dev.springbootpetshopapplication.Controller;

import dev.springbootpetshopapplication.Models.Employee;
import dev.springbootpetshopapplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public List<Employee> getListEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping(value = "/create-employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }
}
