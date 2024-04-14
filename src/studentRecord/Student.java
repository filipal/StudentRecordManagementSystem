package studentRecord;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
    static int studentNumber;
    String studentName;
    int id, age;
    double grade;
    static ArrayList<Student> studentItem = new ArrayList<Student>();

    Student(String studentName, int id, int age, double grade) {
        this.studentName = studentName;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    void changeName() {
        System.out.print("Changing student name");
        String newName = getName();
        this.studentName = newName;
    }

    void changeId() {
        System.out.println("Changing id number");
        int newId = getId();
        this.id = newId;
    }

    void changeAge() {
        System.out.println("Changing student's age");
        int newAge = getAge();
        this.age = newAge;
    }

    void changeGrade() {
        System.out.println("Changing student's grade");
        double newGrade = getGrade();
        this.grade = newGrade;
    }

    static String getName() {
        System.out.print("\nPlease enter the students name: ");
        Scanner name = new Scanner(System.in);
        String studentName = name.nextLine();
        return studentName;
    }

    static int getId() {
        try {
            System.out.print("\nPlease enter the students id number: ");
            Scanner newId = new Scanner(System.in);
            int id = newId.nextInt();
            return id;
        } catch (InputMismatchException e) {
            System.out.println("Id must be an integer!");
            return getId();
        }
    }

    static int getAge() {
        try {
            System.out.print("\nPlease enter the students age: ");
            Scanner newAge = new Scanner(System.in);
            int age = newAge.nextInt();
            return age;
        } catch (InputMismatchException e) {
            System.out.println("Age must be an integer!");
            return getAge();
        }
    }

    static double getGrade() {
        try {
            System.out.print("\nPlease enter the students grade: ");
            Scanner newGrade = new Scanner(System.in);
            double grade = newGrade.nextDouble();
            return grade;
        } catch (InputMismatchException e) {
            System.out.println("Grade must be a real number!");
            return getGrade();
        }
    }
}
