package org.example;

public class GradeConverterApp {
    public static void main(String[] args) {

        Console.displayWelcome();

        String wantsToContinue = "y";
        while (wantsToContinue.equalsIgnoreCase("y")) {
            int numberGrade = Console.getInt("Enter numerical grade: ", 0, 100);
            Grade grade = new Grade(numberGrade);

            System.out.println("Letter grade: " + grade.getLetter());
            System.out.println();

            wantsToContinue = Console.getString("Continue? (y/n): ", "y", "n");
        }
        System.out.println("Goodbye!");
    }
}