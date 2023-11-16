package com.example.StudentDemo.repository;

import com.example.StudentDemo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryStudentRepository implements StudentRepository {

    private final List<Student> students = new ArrayList<>();
    private static long nextId = 1;


    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public Student findById(Long id) {
        return students.stream()
                .filter(student -> student.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Student student) {
        student.setId(nextId++);
        students.add(student);

    }

    @Override
    public void updateStudent(Long id, Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                updatedStudent.setId(id);
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    @Override
    public void deleteById(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }
}
