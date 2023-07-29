
package com.mycompany.testperson;

public class Testperson {

    public static void main(String[] args) {
       Student student = new Student();
student.setName("Abby");
student.setID(12345);
student.setCourse("Computer Science");


Lecturer lecturer = new Lecturer();
lecturer.setName("Jenny");
lecturer.setID(56789);
lecturer.setProgramme("Software Engineering");

System.out.println("Student Name: " + student.getName());
System.out.println("Student ID: " + student.getID());
System.out.println("Student Course: " + student.getCourse());

System.out.println("Lecturer Name: " + lecturer.getName());
System.out.println("Lecturer ID: " + lecturer.getID());
System.out.println("Lecturer Programme: " + lecturer.getProgramme());
    }
}
