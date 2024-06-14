package com.example.mogo.mongodbexample.rep;

import com.example.mogo.mongodbexample.models.StudentMarksDTO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentMarksRepository extends MongoRepository<StudentMarksDTO, ObjectId>{


}
