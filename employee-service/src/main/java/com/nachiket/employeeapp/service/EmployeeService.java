package com.nachiket.employeeapp.service;

import com.nachiket.employeeapp.entity.Employee;
import com.nachiket.employeeapp.repository.EmployeeRepo;
import com.nachiket.employeeapp.response.AddressResponse;
import com.nachiket.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepo employeeRepo;

  @Autowired
  private ModelMapper modelMapper;

  @Autowired
  private RestTemplate restTemplate;

  @Value("${address.base.url}")
  private String url;

  public EmployeeResponse getEmployeeByID(int id){
    AddressResponse addressResponse = new AddressResponse();
    Employee employee = employeeRepo.findById(id).get();
    EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
    addressResponse = restTemplate.getForObject(url+"/address"
            + "/{id}",AddressResponse.class,employee.getId());
    employeeResponse.setAddressResponse(addressResponse);
    return employeeResponse;

  }

}
