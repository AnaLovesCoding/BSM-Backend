package com.bsm.backend.apis.storeadmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StoreAdminRepository extends JpaRepository<StoreAdmin, Long> {
}
