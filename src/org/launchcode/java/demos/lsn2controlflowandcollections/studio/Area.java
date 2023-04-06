package org.launchcode.java.demos.lsn2controlflowandcollections.studio;

import java.util.Scanner; //imports Scanner
public class Area {
    public static void main(String[] args) { //main method executes code from class
        Scanner input = new Scanner(System.in); //new creates instance of class
        System.out.println("Enter a radius: "); //asks user for input
        double radius = input.nextDouble(); //stores user input
        double area = Circle.getArea(radius); //imports menthod from other class in package
        System.out.println("The area of a circle of radius " + radius + " is " + area);
    }

}
