package com.example.mogo.mongodbexample.service;

import com.example.mogo.mongodbexample.models.StudentDTO;
import com.example.mogo.mongodbexample.rep.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentReopsitory;


    public ResponseEntity<List<StudentDTO>> getStudent() {
        return ResponseEntity.ok(this.studentReopsitory.findAll());
    }
    public ResponseEntity<StudentDTO> setStudent(StudentDTO studentDTO) {
        return ResponseEntity.ok(this.studentReopsitory.save(studentDTO));
    }
}