package com.bsm.backend.apis;

import java.util.List;

public interface IStoreAdminService {
    List<StoreAdmin> findAllStoreAdmin();

    StoreAdmin findStoreAdminById(long broncoID);

    StoreAdmin saveStoreAdmin(StoreAdmin storeAdmin);

    StoreAdmin deleteStoreAdmin(StoreAdmin storeAdmin);
}
