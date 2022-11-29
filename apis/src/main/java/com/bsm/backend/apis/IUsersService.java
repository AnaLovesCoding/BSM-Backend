package com.bsm.backend.apis;

import java.util.List;

public interface IUsersService {
    Users findUsersById(long broncoID);

    Users saveUsers(Users users);

}
