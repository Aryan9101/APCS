package ArrayPrograms;

import java.io.*;
import java.util.*;

public class Election {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Votes.txt"));
        String[] candidates = new String[5];
        int[] votes = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++){
            if (input.hasNext()) {
                candidates[i] = input.next();
            }
            if (input.hasNextInt()) {
                votes[i] = input.nextInt();
                sum += votes[i];
                max = Math.max(max, votes[i]);
            }
        }
        double[] percent = new double[5];
        int maxIndex=0;
        for (int i = 0; i < 5; i++){
            percent[i] = (double) votes[i] / sum * 100;
            if (votes[i] == max){
                maxIndex = i;
            }
        }
        System.out.println("Candidates\t\tVotes Received\t\tTotal percentage");
        System.out.println("====================================================");
        for (int i = 0; i < 5; i++){
            System.out.printf("%-16s", candidates[i]);
            System.out.printf("%-20s", votes[i]);
            System.out.printf("%.2f\n", percent[i]);
        }
        System.out.println("====================================================");
        System.out.println("Total Votes: " + sum);
        System.out.printf("Our new class president is %s!\n", candidates[maxIndex]);
    }
}
