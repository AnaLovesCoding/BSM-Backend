package com.bsm.backend.apis.address;

import com.bsm.backend.apis.product.Product;

import java.util.List;

public interface IAddressService {
    List<Address> findAllAddress();

    Address findAddressById(long addressId);

    Address saveAddress(Address address);
}
