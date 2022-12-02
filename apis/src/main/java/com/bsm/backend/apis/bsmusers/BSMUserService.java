package com.bsm.backend.apis.bsmusers;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BSMUserService implements IBSMUserService{
    private final BSMUserRepository repository;
    @Override
    public List<BSMUser> findAllBSMUsers() {
        return repository.findAll();
    }

    @Override
    public BSMUser findBSMUserById(long broncoId) {
        return repository.findById(broncoId).orElseGet(null);
    }

    @Override
    public BSMUser saveBSMUser(BSMUser bsmUser) {
        return repository.save(bsmUser);
    }

    @Override
    public BSMUser deleteBSMUser(BSMUser bsmUser) {
        repository.delete(bsmUser);
        return bsmUser;
    }
}
