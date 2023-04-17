package com.nachiket.employeeapp.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
  private int id;
  private String name;
  private String email;
  private  String bloodGroup;
}
