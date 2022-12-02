package com.bsm.backend.apis.pricehistory;

import java.util.List;

public interface IPriceHistoryService {
    List<PriceHistory> findAllPriceHistory();

    PriceHistory findPriceHistoryById(long priceHistoryId);

}
