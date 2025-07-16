package com.revature.day03;

public class StudentManager {
    public static void main(String[] args){
        Student stu1 = new Student(10,"wick",999999);
        System.out.println(stu1 + " "+ Student.getCourse());
        Student stu2 = new Student();
        stu2.setStuName("rambo");
        stu2.setPhNo(8989);
        stu2.setRollNo(11);
        System.out.println(stu2+ " "+ Student.getCourse());
        Student.setCourse("EEE");
        System.out.println(stu2 + " "+ Student.getCourse());


    }
}

