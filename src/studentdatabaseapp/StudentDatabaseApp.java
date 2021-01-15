package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many users we to add
        System.out.println("Enter amount of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            //System.out.println(students[i].toString());
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString() + "\n");
        }


    }
}
