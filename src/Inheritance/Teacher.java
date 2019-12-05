package Inheritance;

public class Teacher extends Person {

    private int salary;
    private String subject;

    public Teacher (String name, int age, String gender, String subject, int salary){
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " and is earning " + this.salary + " dollars by teaching " + this.subject;
    }
}
