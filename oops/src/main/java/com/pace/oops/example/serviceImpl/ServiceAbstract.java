package com.pace.oops.example.serviceImpl;

import com.pace.oops.example.model.Student;
import com.pace.oops.example.service.StudentService;

import java.util.List;

public abstract class ServiceAbstract implements StudentService {

    public abstract Student saveStudent(Student student);

    public abstract Student fetchStudent(int id);

    public Student deleteStudent(int id) {
        return null;
    }

    public List<Student> fetchAllStudents() {
        return null;
    }

    public Student updateStudent(int id, Student student) {
        return null;
    }
}
