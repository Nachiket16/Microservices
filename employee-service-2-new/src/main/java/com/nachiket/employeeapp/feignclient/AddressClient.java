package com.nachiket.employeeapp.feignclient;

import com.nachiket.employeeapp.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//http://localhost:8081/address-app/api/address/1
@FeignClient(name = "address-service", url = "http://localhost:8081/address-app/api")
public interface AddressClient { //Proxy

  @GetMapping("/address/{id}")
  AddressResponse getAddressByEmployeeId(@PathVariable("id") int id);


}
