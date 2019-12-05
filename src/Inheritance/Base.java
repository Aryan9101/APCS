package Inheritance;

public class Base {
    public Base(){}

    public void first(){
        System.out.print(9);
        second(3);
    }

    public void second(int k){
        System.out.print(8 + "" + k);
    }
}
