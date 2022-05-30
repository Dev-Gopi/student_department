package com.collage;

public class Collage extends University{
    private int collage_id;
    private String collage_name;
    public void identity(int university_id, String university_name, int collage_id, String collage_name){
        super.identity(university_id,university_name);
        this.collage_id = collage_id;
        this.collage_name = collage_name;
    }

    public int getCollage_id() {
        return collage_id;
    }

    public String getCollage_name() {
        return collage_name;
    }
}
