package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.enroll();
        stu1.payTuition();
        System.out.println(stu1.toString());

        //Ask how many users we to add
        System.out.println("Enter amount of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student[] students = new Student[numStudents];
        //Create number of students

    }
}
