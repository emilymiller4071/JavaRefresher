package org.example;

import java.util.Scanner;

        public class GradeConverterApp {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                String wantsToContinue = "y";

                System.out.println("Welcome to the Letter Grade Converter");
                System.out.println();

                while (wantsToContinue.equalsIgnoreCase("y")) {
                    System.out.print("Enter numerical grade: ");
                    int numGrade = scanner.nextInt();

                    String letterGrade = "";
                    if (numGrade >= 88 && numGrade < 101) {
                        letterGrade = "A";
                    } else if (numGrade >= 80 && numGrade < 88) {
                        letterGrade = "B";
                    } else if (numGrade >= 68 && numGrade < 80) {
                        letterGrade = "C";
                    } else if (numGrade >= 60 && numGrade < 68) {
                        letterGrade = "D";
                    } else if (numGrade >= 0 && numGrade < 60) {
                        letterGrade = "F";
                    } else {
                        System.out.println("That is not a valid grade.");
                    }

                    System.out.println("Letter grade: " + letterGrade);
                    System.out.println();
                    System.out.print("Continue? (y/n): ");
                    wantsToContinue = scanner.next();
                    System.out.println();
                }
                System.out.println("Goodbye!");
            }
    }
