package com.example.E_Commerce.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.E_Commerce.Entity.Address;
import com.example.E_Commerce.Repository.AddressRepository;

@Service

public class AddressService {
	
	
	@Autowired
	AddressRepository AddRepo;
	
		    public Address addAddress(Address address) {
	        return AddRepo.save(address);
	    }

	    public List<Address> getAllAddresses() {
	        return AddRepo.findAll();
	    }

	    public Optional<Address> getAddressById(Long id) {
	        return AddRepo.findById(id);
	    }

	    public Address updateAddress( Address address) {
	        return AddRepo.save(address);
	    }

	    public void deleteAddress(Long id) {
	    	AddRepo.deleteById(id);
	    }
	}


