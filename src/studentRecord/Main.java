package studentRecord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tStudent Management System\n");
        menuLoop:
        do {
            try {
                System.out.println("""
                        \nWhat function would you like to perform?
                            1) Add New Student
                            2) Update Student Information
                            3) Report
                            4) Exit
                        """);
                System.out.print("---->");
                Scanner menuInput = new Scanner(System.in);
                int selection = menuInput.nextInt();
                switch (selection) {
                    case 1 -> Student.addStudent();
                    case 2 -> Student.editStudent();
                    case 3 -> Student.report();
                    case 4 -> {
                        break menuLoop;
                    }
                    default -> {
                        throw new InputMismatchException();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Selection. Try again.\n\n");
            }
        } while (true);
        System.out.println("Exiting. Have a nice day!");
    }
}
