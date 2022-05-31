package com.example.lec_5;

public class Student {
    private String name;
    private String id;
    private String section;
    private int imgId;

    public Student(String name, String id, String section, int imgId) {
        this.name = name;
        this.id = id;
        this.section = section;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
