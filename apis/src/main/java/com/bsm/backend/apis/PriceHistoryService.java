package com.bsm.backend.apis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceHistoryService implements IPriceHistoryService{
    private final PriceHistoryRepository repository;
    @Override
    public List<PriceHistory> findAllPriceHistory() {
        return repository.findAll();
    }

    @Override
    public PriceHistory findPriceHistoryById(long priceHistoryId) {
        return repository.findById(priceHistoryId).orElseGet(null);
    }
}
