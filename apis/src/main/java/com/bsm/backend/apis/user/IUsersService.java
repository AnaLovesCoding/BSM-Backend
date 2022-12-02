package com.bsm.backend.apis.user;

public interface IUsersService {
    Users findUsersById(long broncoID);

    Users saveUsers(Users users);

}
