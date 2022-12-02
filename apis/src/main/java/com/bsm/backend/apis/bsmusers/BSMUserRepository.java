package com.bsm.backend.apis.bsmusers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BSMUserRepository extends JpaRepository<BSMUser,Long> {
}
