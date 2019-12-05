package Inheritance;

public class Person {

    private int age;
    private String name;
    private String gender;

    public Person(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " is a " + this.gender + " and is " + this.age + " years old";
    }
}
