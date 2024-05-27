package Opps.ClassObjects;

import java.util.Arrays;

class Student{
    int rollNo;
    int studentId;
    String name;

    Student(){
        this.rollNo = -1;
        this.studentId= -1;
        this.name = "";
    }
}
public class ClassConcepts
{
    public static void main(String[] args) {

        Student[] s1 = new Student[5];
        System.out.println(Arrays.toString(s1));
//        System.out.println(s1[0].rollNo);

        Student yash = new Student();
        System.out.println(yash.rollNo);
    }
}
