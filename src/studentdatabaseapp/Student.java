package studentdatabaseapp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String studentID;
    private String courses;
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
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {
                break;
            }
        // replaced (1 != 0) with true
        } while (true);

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // pay tuition
    public void payTuition() {
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }
    // Show status
}
