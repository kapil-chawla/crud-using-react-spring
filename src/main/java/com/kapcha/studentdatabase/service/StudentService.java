package com.kapcha.studentdatabase.service;

import java.util.List;

import com.kapcha.studentdatabase.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudent(Long studentId);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long studentId);
}
