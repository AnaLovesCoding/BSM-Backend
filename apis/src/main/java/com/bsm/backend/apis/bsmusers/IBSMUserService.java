package com.bsm.backend.apis.bsmusers;

import com.bsm.backend.apis.student.Student;

import java.util.List;

public interface IBSMUserService {
    List<BSMUser> findAllBSMUsers();

    BSMUser findBSMUserById(long broncoId);

    BSMUser saveBSMUser(BSMUser bsmUser);

    BSMUser deleteBSMUser(BSMUser bsmUser);
}
