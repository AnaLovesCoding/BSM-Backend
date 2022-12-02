package com.bsm.backend.apis.storeadmin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreAdminService implements IStoreAdminService {
    private final StoreAdminRepository repository;
    @Override
    public List<StoreAdmin> findAllStoreAdmin() {
        return repository.findAll();
    }

    @Override
    public StoreAdmin findStoreAdminById(long broncoId) {
        return repository.findById(broncoId).orElseGet(null);
    }

    @Override
    public StoreAdmin saveStoreAdmin(StoreAdmin storeAdmin) {
        return repository.save(storeAdmin);
    }

    @Override
    public StoreAdmin deleteStoreAdmin(StoreAdmin storeAdmin) {
        repository.delete(storeAdmin);
        return storeAdmin;
    }
}
