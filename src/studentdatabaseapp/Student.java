package studentdatabaseapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String course;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.year = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + year + " " + studentID);

    }

    // Generate an ID
    private void setStudentID() {
        // grade level + ID
        id++;
        this.studentID = year + "" + id;
    }

    // Enroll in courses

    // View balance

    // Show status
}
