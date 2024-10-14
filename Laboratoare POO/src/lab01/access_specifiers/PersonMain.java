package lab01.access_specifiers;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();

        // for private attribute, we can only access and modify them, by means of their getter and setter
        person.setName("John");
        System.out.println(person.getName());

        // for default/package-private attributes we can use the attribute directly inside the
        // same package as where the class Person is defined
        person.age = 23;
        System.out.println(person.age);

        // or more preferably,
        person.setAge(20);
        System.out.println(person.getAge());

        // for protected attributes we have the privileges of default and also can use the attribute
        // directly inside the classes that inherit from the Person class
        person.workplace = "Microsoft";
        System.out.println(person.workplace);


        // for public attributes, we can access them directly everywhere
        person.isStudent = true;
        System.out.println(person.isStudent);
    }
}
