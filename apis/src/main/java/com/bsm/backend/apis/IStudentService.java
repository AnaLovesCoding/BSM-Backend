package com.bsm.backend.apis;
import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();

    Student findStudentById(long broncoID);

    Student saveStudent(Student student);

    Student deleteStudent(Student student);
}
