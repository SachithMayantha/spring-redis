package com.fernando.springredis.service;

import com.fernando.springredis.entity.Student;
import com.fernando.springredis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public void delete(Integer id){
        studentRepository.deleteById(id);
    }
}
