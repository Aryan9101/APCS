package ArrayListPrograms;

import ArrayListPrograms.Digits;

public class TestDigit {
    public static void main(String[] args) {
        System.out.println(new Digits(7).isStrictlyIncreasin());
        System.out.println(new Digits(1356).isStrictlyIncreasin());
        System.out.println(new Digits(1336).isStrictlyIncreasin());
        System.out.println(new Digits(1536).isStrictlyIncreasin());
        System.out.println(new Digits(65310).isStrictlyIncreasin());

    }
}
