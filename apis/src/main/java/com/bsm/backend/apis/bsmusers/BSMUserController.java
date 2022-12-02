package com.bsm.backend.apis.bsmusers;

import com.bsm.backend.apis.student.IStudentService;
import com.bsm.backend.apis.student.Student;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bsmUser")
@RequiredArgsConstructor
public class BSMUserController {
    private final IBSMUserService bsmUserService;

    @GetMapping("")
    public List<BSMUser> findAllBSMUsers() {
        return bsmUserService.findAllBSMUsers();
    }

    @GetMapping("/{broncoID}")
    public BSMUser FindBSMUserById(@PathVariable long broncoId) {
        return bsmUserService.findBSMUserById(broncoId);
    }

    @PostMapping("")
    public BSMUser saveBSMUser(@RequestBody BSMUser bsmUser) {
        return bsmUserService.saveBSMUser(bsmUser);
    }

    @DeleteMapping("")
    public BSMUser deleteBSMUser(@RequestBody BSMUser bsmUser) {
        return bsmUserService.deleteBSMUser(bsmUser);
    }
}
