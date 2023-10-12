package dev.springbootpetshopapplication.Controller;

import dev.springbootpetshopapplication.Models.Employee;
import dev.springbootpetshopapplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetShopController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/home")
    public String getPetShop(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "views/home/index";
    }

    @GetMapping(value = "/employee")
    public String getEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "views/employee/index";
    }

    @PostMapping("/employee")
    public String saveEmployee(@ModelAttribute Employee employee, Model model) {
        employeeService.createEmployee(employee);
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "views/home/index";
    }
}
