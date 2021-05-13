package com.kapcha.studentdatabase.service;

import java.util.List;

import com.kapcha.studentdatabase.entity.Student;
import com.kapcha.studentdatabase.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepo;
    
    @Override
    public List<Student> getAllStudents() {
       return this.studentRepo.findAll();
    }

    @Override
    public Student getStudent(Long studentId) {
        return this.studentRepo.findById(studentId).get();
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentRepo.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        Student st = this.studentRepo.getOne(studentId);
        this.studentRepo.delete(st);
    }
    
}
