package com.bsm.backend.apis;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {
    private final StudentRepository repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student findStudentById(long broncoID) {
        return repository.findById(broncoID).orElseGet(null);
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student deleteStudent(Student student) {
        repository.delete(student);
        return student;
    }
}
