package com.nachiket.addressapp.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponse {
  private int id;
  private String line1;
  private String line2;
  private String state;
  private String zip;
  private int employeeId;
}
