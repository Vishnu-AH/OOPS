package com.pace.oops.example.serviceImpl;

import com.pace.oops.example.model.Student;
import com.pace.oops.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl extends ServiceAbstract {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student fetchStudent(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        return optionalStudent.orElse(null);
    }

    @Override
    public Student deleteStudent(int id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            studentRepository.delete(student);
            return student;
        }
        else{
            return null;
        }
    }

    @Override
    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(int id, Student student) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()){
            Student existing = optionalStudent.get();
            existing.setName(student.getName());
            existing.setPhone(student.getPhone());
            return studentRepository.save(existing);
        }else{
            return null;
        }
    }

}
