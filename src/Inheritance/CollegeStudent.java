package Inheritance;

public class CollegeStudent extends  Student{

    private String major;
    private int yearInCollege;

    public CollegeStudent(String name, int age, String gender, double gpa, int idNumber, String major, int yearInCollege){
        super(name, age, gender, gpa, idNumber);
        this.major = major;
        this.yearInCollege = yearInCollege;
    }

    public int getYearInCollege() {
        return yearInCollege;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYearInCollege(int yearInCollege) {
        this.yearInCollege = yearInCollege;
    }

    @Override
    public String toString() {
        return super.toString() + " in the year " + this.yearInCollege + ", studying " + this.major;
    }
}
