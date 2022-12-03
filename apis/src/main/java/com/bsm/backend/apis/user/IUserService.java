package com.bsm.backend.apis.user;

public interface IUserService {
    User findUserById(long broncoID);

    User saveUser(User user);
}
