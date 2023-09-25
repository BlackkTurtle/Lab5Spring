package org.planning.mustache.controller;

import java.util.List;

import org.planning.mustache.dao.EmployeeDAO;
import org.planning.mustache.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private EmployeeDAO employeeDAO;
        @RequestMapping("/")
    public String handleRequest(Model model) {
        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("employees", employees);
        return "employee";
    }
}
