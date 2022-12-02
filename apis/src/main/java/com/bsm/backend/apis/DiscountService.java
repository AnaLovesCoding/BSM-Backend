package com.bsm.backend.apis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DiscountService implements IDiscountService{
    private final DiscountRepository repository;
    @Override
    public List<Discount> findAllDiscount() {
        return repository.findAll();
    }

    @Override
    public Discount saveDiscount(Discount discount) {
        return repository.save(discount);
    }

    @Override
    public Discount deleteDiscount(Discount discount) {
         repository.delete(discount);
         return discount;

    }
}
