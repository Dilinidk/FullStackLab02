package com.example.practicalGuide_02.Service;

import java.util.List;

import com.example.practicalGuide_02.Model.Student;

public interface StudentService {
    Student addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Student student, long id);
    void deleteStudent(long id);
}