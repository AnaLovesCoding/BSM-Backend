package com.bsm.backend.apis;

import java.util.List;

public interface IPriceHistoryService {
    List<PriceHistory> findAllPriceHistory();

    PriceHistory findPriceHistoryById(long priceHistoryId);

}
