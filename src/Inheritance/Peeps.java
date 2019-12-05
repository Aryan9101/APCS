package Inheritance;

public class Peeps {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Person("Ethan", 16, "male");
        people[1] = new Student("Aryan", 15, "male", 4.5, 830190);
        people[2] = new Teacher("Mrs. Poulos", 40, "female", "Computer Science", 100000);
        people[3] = new CollegeStudent("Andrew", 18,
                "male", 4.00, 100, "Computer Science", 2018);

        for(Person i : people){
            System.out.println(i.toString());
        }
    }
}
