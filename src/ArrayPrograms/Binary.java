package ArrayPrograms;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int[] binary = new int[8];
        int sum = 0;
        for (int i = 0; i < binary.length; i++){
            binary[i] = (int)(Math.random()*2);
            sum += Math.pow(binary[i] * 2, 7-i);
        }

        System.out.println(Arrays.toString(binary));
        System.out.println("Decimal format: " + sum);
    }
}
