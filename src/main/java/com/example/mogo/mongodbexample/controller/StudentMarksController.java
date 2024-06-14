package com.example.mogo.mongodbexample.controller;

import com.example.mogo.mongodbexample.models.StudentMarksDTO;
import com.example.mogo.mongodbexample.pojo.StudentMarkspojo;
import com.example.mogo.mongodbexample.service.StudentMarksService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("/studentMarks")
public class StudentMarksController {
    private final StudentMarksService studentMarksService;

    @Autowired
    public StudentMarksController(StudentMarksService studentMarksService) {
        this.studentMarksService = studentMarksService;
    }

    @GetMapping("/fetch/{id}")
    public Optional<StudentMarksDTO> getStudentsById(@PathVariable ObjectId id){
        return  studentMarksService.getStudentsById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<StudentMarksDTO> addStudentMarks(@RequestBody StudentMarkspojo studentMarks){

        return studentMarksService.setStudentMarks(studentMarks);
    }

}
