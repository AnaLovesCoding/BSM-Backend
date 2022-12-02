package com.bsm.backend.apis.discount;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discounts")
@RequiredArgsConstructor
public class DiscountController {
    private final IDiscountService discountService;
    @GetMapping("")
    public List<Discount> findAllDiscount() {
        return discountService.findAllDiscount();
    }
    @PostMapping("")
    public Discount saveDiscount(@RequestBody Discount discount) {
        return discountService.saveDiscount(discount);
    }

    @DeleteMapping("")
    public Discount deleteDiscount(@RequestBody Discount discount) {
        return discountService.deleteDiscount(discount);
    }
}
