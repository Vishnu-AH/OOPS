package com.pace.oops.example.service;

import com.pace.oops.example.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public Student fetchStudent(int id);

    public Student deleteStudent(int id);

    public List<Student> fetchAllStudents();

    public Student updateStudent(int id, Student student);
}
