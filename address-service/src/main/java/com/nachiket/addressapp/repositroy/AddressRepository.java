package com.nachiket.addressapp.repositroy;

import com.nachiket.addressapp.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

  Address findByEmployeeId(int id);
}
