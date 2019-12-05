package Inheritance;

public class WeightedCourse extends Course{

    private double weight;

    public WeightedCourse(String name, int grade, double weight){
        super(name, grade);
        this.weight = weight;
    }

    @Override
    public double getGrade() {
        return Math.round(super.getGrade() * this.weight * 10) / (double) 10;
    }

    @Override
    public String toString() {
        return super.toString() + "     Weighted Grade: " + getGrade();
    }
}
