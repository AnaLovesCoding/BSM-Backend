package com.bsm.backend.apis;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/priceHistory")
@RequiredArgsConstructor
public class PriceHistoryController {
    private final IPriceHistoryService priceHistoryService;

    @GetMapping("")
    public List<PriceHistory> findAllPriceHistory() {
        return priceHistoryService.findAllPriceHistory();
    }
    @GetMapping("/{priceHistoryId}")
    public PriceHistory findPriceHistoryById(@PathVariable long priceHistoryId) {
        return priceHistoryService.findPriceHistoryById(priceHistoryId);
    }

}
