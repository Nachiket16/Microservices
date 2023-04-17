package com.nachiket.employeeapp.service;

import com.nachiket.employeeapp.entity.Employee;
import com.nachiket.employeeapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepo employeeRepo;

  public Employee getEmployeeByID(Integer id){
    Employee employee = employeeRepo.findById(id).get();
    return employee;

  }

}
