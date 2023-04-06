package org.launchcode.java.demos.lsn2controlflowandcollections.exercise;

import java.util.Scanner; //imports Scanner
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input variable of type Scanner
        System.out.println("What is the length of the rectangle?"); //question asked of user
        int length = input.nextInt(); //used .nextInt() since return type is integer, variable to store user response using Scanner's .nextLine() method
        System.out.println("What is the width of the rectangle?"); //question asked of user
        int width = input.nextInt(); //used .nextInt() since return type is integer, variable to store user response using Scanner's .nextLine() method
        System.out.println("The rectangle area is " + (length * width)); //concatenation to print rectangle area
    }
}
