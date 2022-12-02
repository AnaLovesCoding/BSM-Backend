package com.bsm.backend.apis.professor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor")
@RequiredArgsConstructor
public class ProfessorController {
    private final IProfessorService professorService;

    @GetMapping("")
    public List<Professor> findAllProfessors() {
        return professorService.findAllProfessors();
    }

    @GetMapping("/{broncoID}")
    public Professor findProfessorById(@PathVariable long broncoId) {
        return professorService.findProfessorById(broncoId);
    }

    @PostMapping("")
    public Professor saveProfessor(@RequestBody Professor professor) {
        return professorService.saveProfessor(professor);
    }

    @DeleteMapping("")
    public Professor deleteProfessor(@RequestBody Professor professor) {
        return professorService.deleteProfessor(professor);
    }
}
