package com.example.mogo.mongodbexample.pojo;

import org.bson.types.ObjectId;

public class Studentpojo {
    private String name;
    private String city;
    private String college;

    public Studentpojo( String name, String city, String college) {
        this.name = name;
        this.city = city;
        this.college = college;
    }

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
