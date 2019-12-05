package Inheritance;

public class Course {

    private String name;
    private int grade;

    public Course(String name, int grade){
        this.grade = grade;
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Course: " + String.format("%-30s", this.name) + "Grade: " + this.grade;
    }
}
