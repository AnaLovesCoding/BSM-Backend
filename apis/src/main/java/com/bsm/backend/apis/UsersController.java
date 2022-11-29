package com.bsm.backend.apis;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UsersController {
    private final IUsersService usersService;

    @GetMapping("/{broncoID}")
    public Users FindUsersById(@PathVariable long broncoId) {
        return usersService.findUsersById(broncoId);
    }
    @PostMapping("")
    public Users saveUsers(@RequestBody Users users) {
        return usersService.saveUsers(users);
    }
}
