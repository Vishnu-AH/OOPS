package com.pace.oops.example.controller;

import com.pace.oops.example.model.Student;
import com.pace.oops.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/{id}")
    public Student fetchStudent(@PathVariable int id){
        return studentService.fetchStudent(id);
    }
    @DeleteMapping("/{id}")
    public Student deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
    @GetMapping
    public List<Student> fetchAllStudents(){
        return studentService.fetchAllStudents();
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
}
