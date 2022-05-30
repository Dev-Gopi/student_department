package com.collage;

public class University {
    private int university_id;
    private String university_name;
    public void identity(int university_id, String university_name){
        this.university_id = university_id;
        this.university_name = university_name;
    }

    public int getUniversity_id() {
        return university_id;
    }

    public String getUniversity_name() {
        return university_name;
    }
}
