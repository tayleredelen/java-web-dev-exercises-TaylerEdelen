package org.launchcode.java.demos.lsn2controlflowandcollections.exercise;

import java.util.Scanner; //imports Scanner
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input variable of type Scanner
        System.out.println("Hello, what is your name?"); //question asked of user
        String name = input.nextLine(); //variable to store user response using Scanner's .nextLine() method
        System.out.println("Hello " + name); //concatenation to print greeting
    }
}
