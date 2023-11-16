package com.example.StudentDemo.controller;

import com.example.StudentDemo.model.Student;
import com.example.StudentDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentRepository.save(student);
    }

    @PutMapping("/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        studentRepository.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }

    // Other methods...
}
