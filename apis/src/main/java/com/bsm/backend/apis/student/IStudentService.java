package com.bsm.backend.apis.student;

import com.bsm.backend.apis.student.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAllStudents();

    Student findStudentById(long broncoID);

    Student saveStudent(Student student);

    Student deleteStudent(Student student);
}
