package com.example.springjpadata.service;

import com.example.springjpadata.entity.Employee;
import com.example.springjpadata.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    public Employee getEmployeeDetails(Integer id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> getAllEmployeeDetails(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public void deleteEmployee(Integer id){
         employeeRepository.deleteById(id);
    }
}
