package com.example.springjpadata.service;

import com.example.springjpadata.entity.Employee;
import com.example.springjpadata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    public Optional<Employee> getEmployeeDetails(Integer id){
        return employeeRepository.findById(id);
    }
}
