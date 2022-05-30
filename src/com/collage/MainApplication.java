package com.collage;

public class MainApplication {
    private static int university_id = 123;
    private static String university_name = "Etc";
    private static int collage_id = 456;
    private static String collage_name = "Etc Institutions";
    private static MainApplication main = new MainApplication();

    private static Department identity = new Department(university_id, university_name, collage_id, collage_name);
    private static Department bca = new Department("BCA","Database","java","php","computer applaction");
    private static Department bba = new Department("BBA","math","english","environment","computer");

    public static void main(String[] args) {
        Student gopi = new Student();
        Student suman = new Student();
        Student mrinal = new Student();
        Student surajit = new Student();
        gopi.students(identity,bca,"789","Gopi Bhowmick");
        suman.students(identity,bba,"879","Suman Nayak","computer");
        mrinal.students(identity,bca,"987","Mrinal Parua",true);
        surajit.students(identity,bba,"897","Surajit Samanta","computer",true);
        main.getIdentity(gopi);
        main.getDepartment(gopi);
        main.getStudentInfo(gopi);
        main.getIdentity(suman);
        main.getDepartment(suman);
        main.getStudentInfo(suman);
        main.getIdentity(mrinal);
        main.getDepartment(mrinal);
        main.getStudentInfo(mrinal);
        main.getIdentity(surajit);
        main.getDepartment(surajit);
        main.getStudentInfo(surajit);

    }

    public void getDepartment(Student studentData){
        Department identityDepartment = studentData.getDepartment();
        System.out.println("Department Id: - "+identityDepartment.getDepartment_id());
        System.out.println("Subject One: - "+identityDepartment.getSubject1_name());
        System.out.println("Subject Two: - "+identityDepartment.getSubject2_name());
        System.out.println("Subject Three: - "+identityDepartment.getSubject3_name());
        System.out.println("Subject Four: - "+identityDepartment.getSubject4_name());
    }
    public void getIdentity(Student studentData){
        Department identityData = studentData.getIdentity();
        System.out.println("University Id: - "+identityData.getUniversity_id());
        System.out.println("University Name: - "+identityData.getUniversity_name());
        System.out.println("Collage Id: - "+identityData.getCollage_id());
        System.out.println("Collage Name: - "+identityData.getCollage_name());
    }
    public void getStudentInfo(Student studentData){
        System.out.println("Student Roll No: - "+studentData.getRoll_number());
        System.out.println("Student Name: - "+studentData.getStudent_name());
        if(studentData.getLab() != null) {
            System.out.println("Lab Subject: - "+studentData.getLab());
        }
        if(studentData.getLibrary() != null) {
            System.out.println("Library Status: - "+studentData.getLibrary());
        }
    }
}
