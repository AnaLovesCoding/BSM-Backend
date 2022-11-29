package com.bsm.backend.apis;

import java.util.List;

public interface IProfessorService {
    List<Professor> findAllProfessors();

    Professor findProfessorById(long broncoID);

    Professor saveProfessor(Professor professor);

    Professor deleteProfessor(Professor professor);
}
