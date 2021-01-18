package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private int year;
    private String studentID;
    private String courses = "";
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

        System.out.print("\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student grade level: ");
        this.year = in.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastName + " " + year + " " + studentID);
    }

    //convert year number to year name
    public String convertYear(int year) {
        if (year == 1) {
            return "Freshman";

        } else if (year == 2) {
            return "Sophomore";

        } else if (year == 3) {
            return "Junior";

        } else {
            return "Senior";
        }
    }

    // Generate an ID
    private void setStudentID() {
        // grade level + ID
        id++;
        this.studentID = year + "" + id;
    }

    // Enroll in courses
    public String enroll() {

        do {
            System.out.println("\n1 - History 101\n2 - Math 101\n3 - English 101\n4 - Chemistry 101\n5 " +
                    "- Computer Science 101\nEnter course to enroll (6 to quit): ");
            Scanner in = new Scanner(System.in);
            int course = in.nextInt();

//            if (courses != "null"){
//
//            }


            //if (course != 6) {
            if (course == 1) {
                String courseName = "History 101";
                courses = courses + "\n  " + courseName;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else if (course == 2) {
                String courseName = "Math 101";
                courses = courses + "\n  " + courseName;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else if (course == 3) {
                String courseName = "English 101";
                courses = courses + "\n  " + courseName;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else if (course == 4) {
                String courseName = "Chemistry 101";
                courses = courses + "\n  " + courseName;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else if (course == 5) {
                String courseName = "Computer Science 101";
                courses = courses + "\n  " + courseName;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else if (course == 6) {
                return "None";
            }
            //later on add error message if another value is input

            // }

        } while (true);


        /*do {
            System.out.println("1 - History 101\n2 - Math 101\n3 English 101\n4 - Chemistry\n5 - Computer Science\nEnter course to enroll (q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.next();

            /*if (!course.equals("q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;

            } else {
                break;
            }
            // replaced (1 != 0) with true
        } while (true);*/

        //System.out.println("Enrolled in: " + courses);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance now is: $" + tuitionBalance + "\n");
    }

    // pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

    // Show status
    public String toString() {
        return "Name: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1) +
                " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1) +
                "\nYear: " + convertYear(year) +
                "\nStudent ID: " + studentID +
                "\nCourses enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
