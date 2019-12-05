package Inheritance;

public class Employee {
    private String name, department;
    private Double rateOfPay;

    public Employee(String name, String department, double rateOfPay){
        this.name = name;
        this.department = department;
        this.rateOfPay = rateOfPay;
    }

    public String getName() {
        return name;
    }

    public Double getRateOfPay() {
        return rateOfPay;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRateOfPay(Double rateOfPay) {
        this.rateOfPay = rateOfPay;
    }

    public double getWeeklyPay(int hours){
        return this.getRateOfPay() * hours;
    }

    @Override
    public String toString() {
        return this.name + " works in the " + department + " department.";
    }
}
