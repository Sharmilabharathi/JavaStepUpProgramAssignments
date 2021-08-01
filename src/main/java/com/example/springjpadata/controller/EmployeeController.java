package com.example.springjpadata.controller;

import com.example.springjpadata.entity.Employee;
import com.example.springjpadata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

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

    @RequestMapping (value="/success", method = RequestMethod.POST)
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee,
                                    @RequestParam("empName") String name, Model model)
    {
        model.addAttribute("empName", name);
        employeeService.addEmployee(employee);
        return new ModelAndView("success");
    }

    @RequestMapping (value="/display", method = RequestMethod.GET)
    public ModelAndView getEmployeeDetails(@RequestParam int empId){
        ModelAndView modelAndView = new ModelAndView("display");
        Optional<Employee> employee = employeeService.getEmployeeDetails(empId);
        modelAndView.addObject("employeeData",employee);
        return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView updateEmployeeDetails(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("edit");
        Employee employee=employeeService.getEmployeeDetails(id).get();
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}