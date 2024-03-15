package com.spring.crudpractice.employee.controller;

import com.spring.crudpractice.employee.model.dto.EmployeeDTO;
import com.spring.crudpractice.employee.model.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String findMenuList(Model model) {

        List<EmployeeDTO> empList = employeeService.findAllEmp();

        model.addAttribute("empList", empList);

        return "employee/list";
    }

    @GetMapping("/insert")
    public void insertPage(){}

    @PostMapping("/insert")
    public String insertEmp(@ModelAttribute EmployeeDTO emp) {

        employeeService.insertEmp(emp);

        return "redirect:/employee/list";
    }

}
