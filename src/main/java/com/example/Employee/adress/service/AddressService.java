package com.example.Employee.adress.service;

import com.example.Employee.adress.model.Address;
import com.example.Employee.adress.repository.AddressRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService {

 AddressRepo addressRepo;

    public List<Address> getAllAddresses() {
        addressRepo.get

    }

    public Address getAddressById(Long id) {
        addressRepo.

    }

    public Address createAddress(Address address) {
    }

    public Address updateAddress(Long id, Address address) {
    }

    public void deleteAddress(Long id) {
    }
}
