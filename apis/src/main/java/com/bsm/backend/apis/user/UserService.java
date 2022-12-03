package com.bsm.backend.apis.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UsersRepository repository;

    @Override
    public User findUserById(long broncoID) {
        return repository.findById(broncoID).orElseGet(null);
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }
}
