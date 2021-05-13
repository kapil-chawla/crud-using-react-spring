package com.kapcha.studentdatabase.repository;

import com.kapcha.studentdatabase.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    
}
