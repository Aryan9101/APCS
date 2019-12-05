package Inheritance;

public class Student extends Person {

    private  int idNumber;
    private double gpa;

    public Student(String name, int age, String gender, double gpa, int idNumber){
        super(name, age, gender);
        this.gpa = gpa;
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " with an id number of " + this.idNumber + " and gpa " + this.gpa;
    }
}
