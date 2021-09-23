package com.school.models;

public class Student {
    private String fullName;
    private String studentId;
    private String birthDate;
    private int picture;

    public Student(String fullName, String studentId, String birthDate, int picture) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.birthDate = birthDate;
        this.picture = picture;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
