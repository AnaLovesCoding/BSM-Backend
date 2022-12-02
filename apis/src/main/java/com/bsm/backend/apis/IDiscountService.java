package com.bsm.backend.apis;

import java.util.List;

public interface IDiscountService {
    List<Discount> findAllDiscount();

    Discount saveDiscount(Discount discount);

    Discount deleteDiscount(Discount discount);
}
