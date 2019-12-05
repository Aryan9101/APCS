package Inheritance;

import java.util.*;

public class RunCourse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Course> reportCard = new ArrayList<Course>();

        String name, choice;
        int grade = 0;

        double unweightedTotal = 0;
        double weightedTotal = 0;
        int count = 0;

        do{
            System.out.print("Enter a course: ");
            name = in.nextLine();
            System.out.print("Enter grade for that course: ");
            grade = in.nextInt();
            if (name.substring(0,2).equals("AP")){
                reportCard.add(new WeightedCourse(name, grade, 1.2));
                weightedTotal += reportCard.get(count).getGrade();
            } else {
                reportCard.add(new Course(name, grade));
                weightedTotal += grade;
            }
            unweightedTotal += grade;
            count ++;
            System.out.print("Do you want to enter another course? ");
            choice = in.next();
            in.nextLine(); //#ScannerProblems
            System.out.println();
        } while (choice.equals("y"));

        for(int i = 0; i<reportCard.size(); i++){
            System.out.println(reportCard.get(i));
        }
        System.out.println("\nAverage Before Weighing: " + unweightedTotal / count);
        System.out.println("Average After Weighing: " + weightedTotal/count);
    }
}
