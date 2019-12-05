package Inheritance;

public class Payroll {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Jo Schmoe" , "Warehouse", 14.50);
        staff[1] = new UnionEmployee("Jimmy Hoff" , "Transportation" , 17.25 , 45.00);
        staff[2] = new CommsionedEmployee("Fast Eddy" , "Sales" , 12.90 , 0.025,
                3500);

        int total = 0;
        System.out.println("35 hours each");
        for (int i = 0; i < staff.length; i++){
            System.out.println(staff[i] + "Pay: " + staff[i].getWeeklyPay(35));
            total+=staff[i].getWeeklyPay(35);
        }
        System.out.println("Payroll for this week is " + total);

        total = 0;
        System.out.println("40 hours each");
        for (int i = 0; i < staff.length; i++){
            System.out.println(staff[i] + "Pay: " + staff[i].getWeeklyPay(40));
            total+=staff[i].getWeeklyPay(40);
        }
        System.out.println("Payroll for this week is " + total);

        total = 0;
        System.out.println("45 hours each");
        for (int i = 0; i < staff.length; i++){
            System.out.println(staff[i] + "Pay: " + staff[i].getWeeklyPay(45));
            total+=staff[i].getWeeklyPay(45);
        }
        System.out.println("Payroll for this week is " + total);

        staff[1].setDepartment("Finance");
        staff[1].setRateOfPay(20.25);
        System.out.println("UnionEmployee promoted to " + staff[1].getDepartment() + " and has his salary raised to " +
                staff[1].getRateOfPay());

        ((UnionEmployee)staff[1]).setDues(45.0);
        System.out.println("New payroll for Union Employee after working for 20 hours and 45 dollars due is " +
                staff[1].getWeeklyPay(20));

        ((CommsionedEmployee)staff[2]).setSales(2000);
        ((CommsionedEmployee)staff[2]).setCommisionRate(0.035);
        System.out.println("Commissioned Employee's weekly pay after " + ((CommsionedEmployee)staff[2]).getSales() +
                " worth " + ((CommsionedEmployee)staff[2]).getCommisionRate() + " each and 20 hours of work is " +
                ((CommsionedEmployee)staff[2]).getWeeklyPay(20)
        );
    }
}
