package com.example.mogo.mongodbexample.service;

import com.example.mogo.mongodbexample.models.StudentDTO;
import com.example.mogo.mongodbexample.models.StudentMarksDTO;
import com.example.mogo.mongodbexample.pojo.StudentMarkspojo;
import com.example.mogo.mongodbexample.rep.StudentMarksRepository;
import com.example.mogo.mongodbexample.rep.StudentRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentMarksService {
    @Autowired
    private StudentMarksRepository studentMarksRepository;

    @Autowired
    private StudentRepository studentRepository;

    public ResponseEntity<StudentMarksDTO> setStudentMarks(StudentMarkspojo studentMarks) {
        StudentMarksDTO studentMarksDTO;
        studentMarksDTO = new StudentMarksDTO();
        StudentDTO studentDTO = studentRepository.findByName(studentMarks.getName());
        studentMarksDTO.setStudentDTO(studentDTO);
        studentMarksDTO.setName(studentMarks.getName());
        studentMarksDTO.setScience(studentMarks.getScience());
        studentMarksDTO.setHistory(studentMarks.getHistory());
        studentMarksDTO.setEng(studentMarks.getEng());
        studentMarksDTO.setSst(studentMarks.getSst());
        studentMarksDTO.setMaths(studentMarks.getMaths());
        return ResponseEntity.ok(this.studentMarksRepository.save(studentMarksDTO));
    }

    public Optional<StudentMarksDTO> getStudentsById(ObjectId id) {
        return this.studentMarksRepository.findById(id);
    }
}