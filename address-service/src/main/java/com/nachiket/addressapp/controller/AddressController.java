package com.nachiket.addressapp.controller;

import com.nachiket.addressapp.response.AddressResponse;
import com.nachiket.addressapp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
  @Autowired
  private AddressService addressService;
  @GetMapping("/address/{employeeId}")
  public AddressResponse getAddressByEmployeeId(@PathVariable("employeeId") int id){
    AddressResponse addressByEmpId = addressService.getAddressByEmpId(id);
    return addressByEmpId;
  }

}
