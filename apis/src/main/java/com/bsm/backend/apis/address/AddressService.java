package com.bsm.backend.apis.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressService implements IAddressService{
    private final AddressRepository repository;
    @Override
    public List<Address> findAllAddress() {
        return repository.findAll();
    }

    @Override
    public Address findAddressById(long addressId) {
        return repository.findById(addressId).orElseGet(null);
    }

    @Override
    public Address saveAddress(Address address) {
        return repository.save(address);
    }
}
