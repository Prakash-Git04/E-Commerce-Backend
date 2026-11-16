package com.example.E_Commerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.E_Commerce.Entity.Address;

@Repository

public interface AddressRepository extends JpaRepository<Address, Long> {

}
