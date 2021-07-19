package com.example.week01.prac;

public class Course {
    private String title;
    public String tutor;
    public int days;

    // 생성자 (기본 생성자)
    public Course(){

    }

    // 생성자
    public Course(String title, String tutor, int days){
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setTutor(String tutor){
        this.tutor = tutor;
    }

    public void setDays(int days){
        this.days = days;
    }

    // getter
    public String getTitle(){
        return this.title;
    }
    public String getTutor(){
        return this.tutor;
    }
    public int getDays(){
        return this.days;
    }

}

