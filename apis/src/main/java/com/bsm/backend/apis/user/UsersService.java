package com.bsm.backend.apis.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService implements IUsersService {
    private final UsersRepository repository;

    @Override
    public Users findUsersById(long broncoID) {
        return repository.findById(broncoID).orElseGet(null);
    }

    @Override
    public Users saveUsers(Users users) {
        return repository.save(users);
    }
}
