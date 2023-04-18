package com.nachiket.addressapp.service;

import com.nachiket.addressapp.entity.Address;
import com.nachiket.addressapp.repositroy.AddressRepository;
import com.nachiket.addressapp.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

  @Autowired
  private AddressRepository addressRepository;
  @Autowired
  private ModelMapper modelMapper;

  public AddressResponse getAddressByEmpId(int id) {
    Address byEmployeeId = addressRepository.findByEmployeeId(id);
    AddressResponse response = modelMapper.map(byEmployeeId, AddressResponse.class);
    return  response;
  }
}
