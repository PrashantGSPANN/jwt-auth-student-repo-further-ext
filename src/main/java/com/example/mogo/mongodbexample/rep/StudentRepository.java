package com.example.mogo.mongodbexample.rep;

import com.example.mogo.mongodbexample.models.StudentDTO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentDTO, ObjectId> {
    StudentDTO findByName(String name);
}