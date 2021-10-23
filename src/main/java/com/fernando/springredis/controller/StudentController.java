package com.fernando.springredis.controller;

import com.fernando.springredis.entity.Student;
import com.fernando.springredis.service.StudentService;
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

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }

    @DeleteMapping(value ="/{id}")
    public void delete(@PathVariable Integer id){
        studentService.delete(id);
    }
}
