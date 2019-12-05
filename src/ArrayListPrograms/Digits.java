package ArrayListPrograms;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitsList;

    public Digits(int num){
        digitsList = new ArrayList<Integer>();
        if (num == 0){
            digitsList.add(0);
        }
        while (num > 0){
            digitsList.add(0, num % 10);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasin(){
        for (int i = 0; i < digitsList.size()-1; i++) {
            if (digitsList.get(i) < digitsList.get(i+1)){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
