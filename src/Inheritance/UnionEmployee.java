package Inheritance;

public class UnionEmployee extends Employee{
    private Double dues;

    public UnionEmployee(String name, String department, double rateOfPay, double dues){
        super(name, department, rateOfPay);
        this.dues = dues;
    }

    public Double getDues() {
        return dues;
    }

    public void setDues(Double dues) {
        this.dues = dues;
    }

    @Override
    public double getWeeklyPay(int hours) {
        return(super.getRateOfPay() * hours) + ((hours % 40) * super.getRateOfPay() * 0.5) - dues;
    }
}
