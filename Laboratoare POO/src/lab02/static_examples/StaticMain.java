package lab02.static_examples;

public class StaticMain {
    public static void main(String[] args) {
        // the static method gets called with the class name instead of the instance name
        System.out.println("Animal count " + Animal.getAnimalCount());

        Animal dog = new Animal("Cutu", 2);
        Animal cat = new Animal("Pispis", 3);

        System.out.println("Animal count " + Animal.getAnimalCount());

        // we can also refer the static methods/attributes using the instance name, but it is not
        // recommended as the static methods/attributes belong to the class instead of an object
        // also we will learn when going through inheritance that we can have polymorphic methods
        // but this does not apply to static methods as they belong to the class and so the calling class type
        // is identified at compile time using the type of the reference
        System.out.println("Animal count " + dog.getAnimalCount());

        System.out.println("Missing animals count " + Animal.missingAnimalsCount);
    }
}
