package Inheritance;

public class CommsionedEmployee extends Employee{

    private double commisionRate;
    private int sales;

    public CommsionedEmployee(String name, String department, double rateOfPay, double commisionRate, int sales){
        super(name, department, rateOfPay);
        this.commisionRate = commisionRate;
        this.sales = sales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public int getSales() {
        return sales;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    @Override
    public double getWeeklyPay(int hours) {
        return super.getWeeklyPay(hours) + this.commisionRate * this.sales;
    }
}
