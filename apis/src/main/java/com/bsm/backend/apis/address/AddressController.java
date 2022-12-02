package com.bsm.backend.apis.address;
import com.bsm.backend.apis.product.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/address")
@RequiredArgsConstructor
public class AddressController {
    private final IAddressService addressService;

    @GetMapping("")
    public List<Address> findAllAddress() {
        return addressService.findAllAddress();
    }

    @GetMapping("/{addressId}")
    public Address FindAddressById(@PathVariable long addressId) {
        return addressService.findAddressById(addressId);
    }

    @PostMapping("")
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }
}
