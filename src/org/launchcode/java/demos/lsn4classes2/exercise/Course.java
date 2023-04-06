package org.launchcode.java.demos.lsn4classes2.exercise;

import java.util.ArrayList;

public class Course {

//variables
    private String name;
    private ArrayList<Student> students;
    private int worthNumberOfCredits;

 //constructors
    public Course(String name, int numberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }


//toString method

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

//equals method

    @Override //equal if they have same memory addresses
    public boolean equals(Object obj) { //equal if instance of Course class with same name
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if (myCourseObj.name.equals(this.name)) return true; //this .equals does not apply with line 21
        else return false;
    }


}
