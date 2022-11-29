package com.bsm.backend.apis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;

    @GetMapping("")
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/{broncoID}")
    public Student FindProductById(@PathVariable long broncoId) {
        return studentService.findStudentById(broncoId);
    }

    @PostMapping("")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("")
    public Student deleteStudent(@RequestBody Student student) {
        return studentService.deleteStudent(student);
    }
}
