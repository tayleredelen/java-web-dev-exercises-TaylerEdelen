package org.launchcode.java.demos.lsn2controlflowandcollections.exercise;

import java.util.Scanner; //imports Scanner
public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //input variable of type Scanner
        System.out.println("How many miles have you driven?"); //question asked of user
        Double miles = input.nextDouble(); //used .nextDouble() since return type is integer, variable to store user response using Scanner's .nextLine() method
        System.out.println("How many gallons of gas have you used?"); //question asked of user
        Double gallons = input.nextDouble(); //used .nextDouble() since return type is integer, variable to store user response using Scanner's .nextLine() method
        System.out.println("Miles-per-gallon is " + (miles / gallons)); //concatenation to print mpg
    }
}
