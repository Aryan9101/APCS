package ArrayPrograms;

import java.util.Arrays;

public class DiceRollBarGraph {
    public static void main(String[] args) {
        int[] frequency = new int[11];
        for(int i = 0; i < 100; i++){
            int dice1 = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int sum = dice1+dice2;
            frequency[sum-2]++;
        }
        for (int i = 2; i <= 12; i++){
            System.out.print(i + ": ");
            for (int j = 1; j <= frequency[i-2]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
