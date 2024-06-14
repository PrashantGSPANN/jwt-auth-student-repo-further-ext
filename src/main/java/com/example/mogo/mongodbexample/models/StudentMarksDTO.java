package com.example.mogo.mongodbexample.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "StudentMarksDTO")
public class StudentMarksDTO {

    @Id
    private ObjectId id;

    @Indexed(unique=true)
    @DBRef
    private StudentDTO studentDTO;

    @Field("name")
    private String name;

    @Field("eng")
    private int eng;

    @Field("history")
    private int history;

    @Field("maths")
    private int maths;

    @Field("science")
    private int science;

    @Field("sst")
    private int sst;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getSst() {
        return sst;
    }

    public void setSst(int sst) {
        this.sst = sst;
    }
}
