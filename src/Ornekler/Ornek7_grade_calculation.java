package Ornekler;

import java.util.Scanner;

public class Ornek7_grade_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please specify the number of students: ");

        int studentNumber= scanner.nextInt();
        scanner.nextLine();
        String[] students = new String[studentNumber];

        for (int i =0; i < studentNumber; i++){
            System.out.print("Please enter " + (i+1) + ". student's fullname: ");
            students[i] = scanner.nextLine();

        }

        int[] averages = new int[studentNumber];
        for (int i =0; i < studentNumber; i++){
            System.out.println(students[i] + "'s Grades:");

            int totalGrade = 0;
            for (int k = 1; k <= 3; k++){
                System.out.print(k + ". Grade: ");
                int grade = scanner.nextInt();
                totalGrade += grade;

            }

            int avg = totalGrade/3;
            averages[i] = avg;
        }

        for (int i =0; i < students.length; i++){
            System.out.println(students[i] + "'s grade: " + averages[i]);
        }
    }
}