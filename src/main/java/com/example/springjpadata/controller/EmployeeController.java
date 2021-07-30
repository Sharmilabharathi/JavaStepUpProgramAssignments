package com.example.springjpadata.controller;

import com.example.springjpadata.entity.Employee;
import com.example.springjpadata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping( "/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @RequestMapping( "/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @RequestMapping( "/register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }

    @PostMapping ("/success")
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee,
                                    @RequestParam("empName") String name, Model model)
    {
        model.addAttribute("empName", name);
        employeeService.addEmployee(employee);
        return new ModelAndView("success");
    }

}
