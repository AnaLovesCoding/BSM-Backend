package com.bsm.backend.apis.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final IUserService usersService;

    @GetMapping("/{broncoID}")
    public User findUsersById(@PathVariable long broncoId) {
        return usersService.findUserById(broncoId);
    }

    @PostMapping("")
    public User saveUser(@RequestBody User user) throws Exception {
        if (!Objects.equals(user.getUserType(), "STUDENT") ||
                !Objects.equals(user.getUserType(), "PROFESSOR") ||
                !Objects.equals(user.getUserType(), "STUDENT_AND_PROFESSOR")
        ) throw new Exception();

        return usersService.saveUser(user);
    }
}
