package com.example.mogo.mongodbexample.pojo;

import com.example.mogo.mongodbexample.models.StudentDTO;
import org.bson.types.ObjectId;

public class StudentMarkspojo {

    private StudentDTO studentDTO;
    private String name;
    private int eng;
    private int history;
    private int maths;
    private int science;
    private int sst;

    public StudentMarkspojo(String name, int eng, int history, int maths, int science, int sst){
        this.name=name;
        this.eng=eng;
        this.history=history;
        this.maths=maths;
        this.science=science;
        this.sst=sst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
