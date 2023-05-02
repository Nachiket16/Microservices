package com.nachiket.employeeapp.service;

import com.nachiket.employeeapp.entity.Employee;
import com.nachiket.employeeapp.feignclient.AddressClient;
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
  private AddressClient addressClient;

  @Value("${address.base.url}")
  private String url;

  public EmployeeResponse getEmployeeByID(int id){

    Employee employee = employeeRepo.findById(id).get();

    EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);

    AddressResponse addressResponse = addressClient.getAddressByEmployeeId(id);

    employeeResponse.setAddressResponse(addressResponse);
    return employeeResponse;

  }

}
