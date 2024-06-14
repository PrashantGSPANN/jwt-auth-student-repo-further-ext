package com.example.mogo.mongodbexample.controller;

import com.example.mogo.mongodbexample.models.StudentDTO;
import com.example.mogo.mongodbexample.pojo.Studentpojo;
import com.example.mogo.mongodbexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/test/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public ResponseEntity<StudentDTO> addStudent(@RequestBody Studentpojo student){
        StudentDTO studentDTO;
        studentDTO = new StudentDTO();
        studentDTO.setName(student.getName());
        studentDTO.setCity(student.getCity());
        studentDTO.setCollege(student.getCollege());
        return  studentService.setStudent(studentDTO);
    }
    @GetMapping("/fetch")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<StudentDTO>> getStudents(){
        return  studentService.getStudent();
    }
//    @PostMapping("/addstudentmarks")
//    public ResponseEntity<StudentMarkspojo> addStudentMarks(@RequestBody StudentMarkspojo studentMarks){
//        return studentService.setStudentMarks(studentMarks);
//    }
}
