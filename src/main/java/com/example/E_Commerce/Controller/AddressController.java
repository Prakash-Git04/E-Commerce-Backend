package com.example.E_Commerce.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.E_Commerce.Entity.Address;
import com.example.E_Commerce.Service.AddressService;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    //AddAddress
    @PostMapping("/addAddress")
    public Address addAddress(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    //AllAddress
    @GetMapping("/allAdress")
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    //GetAddress
    @GetMapping("Getaddress/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }

    
    //UpdateAddress
    @PutMapping("/updateAddress")
    public Address updateAddress(@RequestBody Address address) {
        return addressService.updateAddress( address);
    }

    @DeleteMapping("/deleteAddress/{id}")
    public String deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return "Address deleted successfully";
    }
}