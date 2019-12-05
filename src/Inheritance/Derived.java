package Inheritance;

public class Derived extends Base {
    public Derived(){}

    public void first(){
        super.first();
    }

    public void second(int k){
        System.out.print(8 + "" + k + "" + (k-1));
    }
}
