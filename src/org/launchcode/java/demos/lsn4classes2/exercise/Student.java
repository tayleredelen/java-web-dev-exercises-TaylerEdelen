package org.launchcode.java.demos.lsn4classes2.exercise;

public class Student {

    public static void main(String[] args) {
        Student me = new Student("Tae", 1, 30, 4.0); //instance of class with my parameters
        Student twin = new Student("Tae", 2, 20, 2.0);
        Teacher theTeacher = new Teacher();
        Course myFirstCourse = new Course("My First Course", 2);
        Course mySecondCourse = new Course("My Second Course", 3);
//        Course mySecondCourse = new Course("My First Course"); //to test .equals()
//        String myGradeLevel = me.getGradeLevel();
//        System.out.println(myGradeLevel);
//        me.addGrade(3, 3.0);
//        System.out.println(me.gpa);
//        me.addGrade(3, 3.0);
//        System.out.println(me.gpa);
//        System.out.println(me.toString());
//        System.out.println(me.equals(twin));
//        System.out.println(me.equals(me));
//        System.out.println(me.equals(theTeacher));
//        System.out.println(myFirstCourse.equals(mySecondCourse)); //same object, but not same name so it returns false
//        System.out.println(myFirstCourse.toString());
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa= gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    //methods
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        //CURRENT total quality score = gpa * numberOfCredits
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        //quality score = letter grade (0.0-4.0) * number of credits
        double newQualityScore = grade * courseCredits;

        //Update CURRENT total quality score with the new quality score we just calculated
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        //Update students total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits; //reassign value

        //gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa; //reassign value


    }

    public String getGradeLevel() {
        //determine grade level of student based on numberOfCredits
        //Freshman (0-29) Sophomore (30-59) Junior (60-89) Senior (90+)
        if (this.numberOfCredits >= 0 && this.numberOfCredits <=29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null;
        }
    }

    //toString & equals
    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override //equal if they have same memory addresses
    public boolean equals(Object obj) { //equal if instance of Student class with same name
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if (myStudentObj.name.equals(this.name)) return true; //this .equals does not apply with line 90
        else return false;
    }

    //getters & setters
    public static int getNextStudentId() {return nextStudentId;}

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
