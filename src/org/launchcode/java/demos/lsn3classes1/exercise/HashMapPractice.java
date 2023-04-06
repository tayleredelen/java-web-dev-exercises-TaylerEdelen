package org.launchcode.java.demos.lsn3classes1.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {
            System.out.println("Student ID: ");
            newStudentID = input.nextInt();
            input.nextLine();
            if (!newStudentID.equals(-1)) {
                System.out.println("Student Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentID, newStudentName);
            }
        } while (!newStudentID.equals(-1)); //ends loop

        System.out.println("\nClass roster: ");

        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());

        }
    }
}