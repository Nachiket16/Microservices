package com.nachiket.employeeapp.controller;

import com.nachiket.employeeapp.entity.Employee;
import com.nachiket.employeeapp.repository.EmployeeRepo;
import com.nachiket.employeeapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
  @Autowired
  EmployeeService employeeService;

  @GetMapping("/employees/{id}")
  Employee getEmployeeDetails(@PathVariable("id") Integer id){
    System.out.println("id = " + id);

    Employee employee = employeeService.getEmployeeByID(id);
    return employee;

  }


}
