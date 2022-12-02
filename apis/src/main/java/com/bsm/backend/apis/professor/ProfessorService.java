package com.bsm.backend.apis.professor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService implements IProfessorService {
    private final ProfessorRepository repository;

    @Override
    public List<Professor> findAllProfessors() {
        return repository.findAll();
    }

    @Override
    public Professor findProfessorById(long broncoID) {
        return repository.findById(broncoID).orElseGet(null);
    }

    @Override
    public Professor saveProfessor(Professor professor) {
        return repository.save(professor);
    }

    @Override
    public Professor deleteProfessor(Professor professor) {
        repository.delete(professor);
        return professor;
    }
}
