package studentRecord;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Metoda za dodavanje novog studenta
    public static void addStudent() {
        try {
            System.out.println("Enter student name, ID, age, and grade:");
            String name = scanner.nextLine();
            int id = scanner.nextInt();
            int age = scanner.nextInt();
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline after double input

            // Provjerava postoji li već student s unesenim ID-om
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Student with this ID already exists.");
                    return;
                }
            }

            students.add(new Student(name, id, age, grade));
            System.out.println("Student added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding student. Please check the input format.");
            scanner.nextLine(); // Clear the scanner buffer in case of an input mismatch
        }
    }

    // Metoda za ažuriranje informacija o studentu
    public static void updateStudent() {
        try {
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Enter new name, age, and grade:");
                    String newName = scanner.nextLine();
                    int newAge = scanner.nextInt();
                    double newGrade = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline

                    student.setName(newName);
                    student.setAge(newAge);
                    student.setGrade(newGrade);
                    System.out.println("Student updated successfully.");
                    return;
                }
            }
            System.out.println("Student ID not found.");
        } catch (Exception e) {
            System.out.println("Error updating student. Please check the input format.");
            scanner.nextLine(); // Clear the scanner buffer in case of an input mismatch
        }
    }

    // Metoda za prikaz informacija o studentu
    public static void viewStudent() {
        try {
            System.out.println("Enter student ID:");
            int id = scanner.nextInt();

            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student ID not found.");
        } catch (Exception e) {
            System.out.println("Error viewing student. Please check the input format.");
            scanner.nextLine(); // Clear the scanner buffer in case of an input mismatch
        }
    }
}
