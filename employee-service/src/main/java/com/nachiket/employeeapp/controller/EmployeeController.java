package com.nachiket.employeeapp.controller;

import com.nachiket.employeeapp.response.EmployeeResponse;
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
  EmployeeResponse getEmployeeDetails(@PathVariable("id") int id){
    System.out.println("id = " + id);
    EmployeeResponse employeeByID = employeeService.getEmployeeByID(id);
    return employeeByID;

  }

}
