package com.revature.day03;

public class Student {
    private int rollNo;
    private String stuName;
    private double phNo;

    private static String course = "CSE";

    public Student(){

    }

    public Student(int rollNo, String stuName, double phNo) {
        this.rollNo = rollNo;
        this.stuName = stuName;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", stuName='" + stuName + '\'' +
                ", phNo=" + phNo +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public double getPhNo() {
        return phNo;
    }

    public void setPhNo(double phNo) {
        this.phNo = phNo;
    }

    public static String getCourse() {
        return course;
    }

    public static void setCourse(String course) {
        Student.course = course;
    }
}
