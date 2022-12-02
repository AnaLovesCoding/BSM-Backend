package com.bsm.backend.apis;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/storeAdmin")
@RequiredArgsConstructor
public class StoreAdminController {
    private final IStoreAdminService storeAdminService;
    @GetMapping("")
    public List<StoreAdmin> findAllStoreAdmin() {
        return storeAdminService.findAllStoreAdmin();
    }

    @GetMapping("/{broncoId}")
    public StoreAdmin findStoreAdminById(@PathVariable long broncoId) {
        return storeAdminService.findStoreAdminById(broncoId);
    }

    @PostMapping("")
    public StoreAdmin saveStoreAdmin(@RequestBody StoreAdmin storeAdmin) {
        return storeAdminService.saveStoreAdmin(storeAdmin);
    }

    @DeleteMapping("")
    public StoreAdmin deleteStoreAdmin(@RequestBody StoreAdmin storeAdmin) {
        return storeAdminService.deleteStoreAdmin(storeAdmin);
    }

}
