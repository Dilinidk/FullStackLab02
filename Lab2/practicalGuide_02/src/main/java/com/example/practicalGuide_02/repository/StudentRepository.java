package com.example.practicalGuide_02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.practicalGuide_02.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

    
}