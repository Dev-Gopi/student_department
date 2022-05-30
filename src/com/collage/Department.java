package com.collage;

public class Department extends Collage{
    private String department_id;
    private String subject1_name;
    private String subject2_name;
    private String subject3_name;
    private String subject4_name;
    Department(int university_id, String university_name, int collage_id, String collage_name){
        super.identity(university_id, university_name, collage_id, collage_name);
    }

    public Department(String department_id, String subject1_name, String subject2_name, String subject3_name, String subject4_name) {
        this.department_id = department_id;
        this.subject1_name = subject1_name;
        this.subject2_name = subject2_name;
        this.subject3_name = subject3_name;
        this.subject4_name = subject4_name;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public String getSubject1_name() {
        return subject1_name;
    }

    public String getSubject2_name() {
        return subject2_name;
    }

    public String getSubject3_name() {
        return subject3_name;
    }

    public String getSubject4_name() {
        return subject4_name;
    }
}
