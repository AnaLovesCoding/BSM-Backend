package com.bsm.backend.apis.discount;

import com.bsm.backend.apis.discount.Discount;

import java.util.List;

public interface IDiscountService {
    List<Discount> findAllDiscount();

    Discount saveDiscount(Discount discount);

    Discount deleteDiscount(Discount discount);
}
