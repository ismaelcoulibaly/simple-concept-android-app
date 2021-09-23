package com.school.model;

public class Class {

    private String title; //le titre du cours
    private String mark; // la note du cours
    private int icon; //le logo du cours

    public Class(String name, String mark, int icon) {
        this.title = name;
        this.mark = mark;
        this.icon = icon;
    }

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}


