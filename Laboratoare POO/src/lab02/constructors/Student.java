package lab02.constructors;

public class Student {
    private int age;
    private int schoolYear = 2;
    private String name;

    public Student(int age, String name, int schoolYear) {
        this(age, name);
        this.schoolYear = schoolYear;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // if we remove/comment out the no parameter constructor, it won't be available to us
    // as when declaring/implementing parametrized constructors, the default compiler generated constructor
    // is no longer available
    public Student() {
        age = 20;
        name = "John";
    }

    public Student(Student other) {
        this.age = other.age;
        this.schoolYear = other.schoolYear;
        this.name = other.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", schoolYear=" + schoolYear +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
