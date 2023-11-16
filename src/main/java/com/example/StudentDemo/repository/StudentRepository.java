package com.example.StudentDemo.repository;

import com.example.StudentDemo.model.Student;
import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);

    void updateStudent(Long id, Student student);
    void deleteById(Long id);
}
