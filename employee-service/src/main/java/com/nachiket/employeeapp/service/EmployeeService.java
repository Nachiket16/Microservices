package com.nachiket.employeeapp.service;

import com.nachiket.employeeapp.entity.Employee;
import com.nachiket.employeeapp.repository.EmployeeRepo;
import com.nachiket.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepo employeeRepo;

  @Autowired
  private ModelMapper modelMapper;

  public EmployeeResponse getEmployeeByID(int id){
    Employee employee = employeeRepo.findById(id).get();
    EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

    return employeeResponse;

  }

}
