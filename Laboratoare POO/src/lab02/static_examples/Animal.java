package lab02.static_examples;

public class Animal {
    private String name;
    private int age;
    private static int animalCount = 0;
    public static int missingAnimalsCount;

    static {
        // this will be called only when loading the class, i.e. when referring the first time to the class
        // by any means: instantiation of an object, static method calls etc.
        missingAnimalsCount = 10;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}
