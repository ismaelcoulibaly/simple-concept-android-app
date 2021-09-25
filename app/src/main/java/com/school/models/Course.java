package com.school.models;

public class Course {

    private String title; //le titre du cours
    private int grade; // la note du cours
    private int icon; //le logo du cours

    public Course(String title, int grade, int icon) {
        this.title = title;
        this.grade = grade;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}