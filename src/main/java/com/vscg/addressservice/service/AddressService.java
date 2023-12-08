package com.vscg.addressservice.service;

import com.vscg.addressservice.entity.Address;
import com.vscg.addressservice.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address addAddress(Address address) {
        Address addressSavedToDB = this.addressRepository.save(address);
        return addressSavedToDB;
    }

}