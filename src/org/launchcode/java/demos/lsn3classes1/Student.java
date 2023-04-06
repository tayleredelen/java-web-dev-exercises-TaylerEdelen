package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public String Student(String name) {
        return(this.name + " has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        //gpa = (total quality score) / (total number of credits)
        return;
    }

    public String getGradeLevel(int credits) {
        //determine grade level of student based on numberOfCredits
        if (credits <= 29) {
            return "Freshman";
        } else if (credits <= 59) {
            return "Sophomore";
        } else if (credits <=89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    public static int getNextStudentId() { return nextStudentId; }

    public static void setNextStudentId(int nextStudentId) {Student.nextStudentId = nextStudentId;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getStudentId() {return studentId;}

    public void setStudentId(int studentId) {this.studentId = studentId;}

    public int getNumberOfCredits() {return numberOfCredits;}

    public void setNumberOfCredits(int numberOfCredits) {this.numberOfCredits = numberOfCredits;}

    public double getGpa() {return gpa;}

    public void setGpa(double gpa) {this.gpa = gpa;}
}