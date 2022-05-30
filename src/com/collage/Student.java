package com.collage;

public class Student{
    private String roll_number;
    private String student_name;
    private Department department;
    private Department identity;
    private String lab;
    private Boolean library;

    public void students(Department identity,Department department,String roll_number, String student_name){
        this.identity = identity;
        this.department = department;
        this.roll_number = roll_number;
        this.student_name = student_name;
    }
    public void students(Department identity,Department department,String roll_number, String student_name,String lab){
        this.identity = identity;
        this.department = department;
        this.roll_number = roll_number;
        this.student_name = student_name;
        this.lab = lab;
    }
    public void students(Department identity,Department department,String roll_number, String student_name,Boolean library){
        this.identity = identity;
        this.department = department;
        this.roll_number = roll_number;
        this.student_name = student_name;
        this.library = library;
    }
    public void students(Department identity,Department bca,String roll_number, String student_name,String lab,Boolean library){
        this.identity = identity;
        this.department = bca;
        this.roll_number = roll_number;
        this.student_name = student_name;
        this.lab = lab;
        this.library = library;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public Department getDepartment() {
        return this.department;
    }

    public String getLab() {
        return lab;
    }

    public Boolean getLibrary() {
        return library;
    }

    public Department getIdentity() {
        return this.identity;
    }
}
