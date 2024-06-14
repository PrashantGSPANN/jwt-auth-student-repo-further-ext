package com.example.mogo.mongodbexample.models;

import jakarta.annotation.Nonnull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "students")
public class StudentDTO {

    @Id
    private ObjectId id;

    @Indexed(unique=true)
    @Field("name")
    private String name;

    @Field("city")
    private String city;

    @Field("college")
    private String college;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
