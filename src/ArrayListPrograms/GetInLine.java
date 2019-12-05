package ArrayListPrograms;

import java.util.*;

public class GetInLine {
    public static void main(String[] args) {
        //init stuff
        ArrayList<String> humans = new ArrayList<>();
        humans.add("Andrew");
        humans.add("Sarah");
        humans.add("Will");
        humans.add("Evelyn");
        humans.add("David");
        System.out.print("\nStep 0: ");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 1
        humans.add("Steven");
        System.out.print("\nStep 1: ");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 2
        System.out.print("\nStep 2: ");
        humans.remove(3);
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 3
        System.out.print("\nStep 3: ");
        humans.add(1, "Samantha");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 4
        System.out.print("\nStep 4: ");
        System.out.print("Index: 3, Position: 4");

        //Step 5
        System.out.print("\nStep 5: ");
        humans.add("Jessica");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 6
        System.out.print("\nStep 6: ");
        humans.remove(3);
        humans.add("Will");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 7
        System.out.print("\nStep 7: ");
        System.out.print(humans.get(humans.size()-2));

        //Step 8
        System.out.print("\nStep 8: ");
        String temp = humans.get(0);
        humans.set(0, humans.get(humans.size()-1));
        humans.set(humans.size()-1, temp);
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 9
        System.out.print("\nStep 9: ");
        boolean isTrue = false;
        for (String i : humans) {
            if (i.equals("David")){
                isTrue = true;
            }
        }
        System.out.print(isTrue);

        //Step 10
        System.out.print("\nStep 10: ");
        humans.add(4, "Sam");
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 11
        System.out.print("\nStep 11: ");
        for (int i = humans.size()-1; i >= 0; i--){
            if (humans.get(i).charAt(0) == 'S'){
                humans.remove(i);
            }
        }
        for (String i : humans){
            System.out.print(i + "\t");
        }

        //Step 12
        System.out.print("\nStep 12: ");
        for (String i : humans){
            System.out.print(i + "\t");
        }

    }
}
