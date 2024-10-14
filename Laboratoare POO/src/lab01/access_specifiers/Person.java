package lab01.access_specifiers;

public class Person {
    // only accessible in this class attributes and methods
    private String name;

    // has no specifier meaning default aka package-private
    int age;

    // only accessible in the package or in the class that inherit this class
    protected String workplace;

    // accessible everywhere we want
    public boolean isStudent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
