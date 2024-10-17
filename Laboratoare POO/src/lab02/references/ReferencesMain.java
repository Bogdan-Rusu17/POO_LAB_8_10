package lab02.references;

public class ReferencesMain {

    public static void changeModelAndColor(Car car, String newModel, String newColor) {
        car.setModel(newModel);
        car.setColor(newColor);
    }

    public static void changeReference(Car car, String model, String color) {
        car = new Car(model, color);
        System.out.println(car);
    }

    public static void main(String[] args) {
        Car toyota = new Car("toyota prius", "red");
        System.out.println(toyota + "\n\n");

        Car hyundai = toyota;
        hyundai.setModel("hyundai");
        System.out.println("This is the hyundai" + hyundai);
        System.out.println("This is the toyota" + toyota+ "\n\n");
        // Both will print out the same content as both hyundai and toyota refer
        // to the same memory location on the heap, so modifications at the
        // memory location that hyundai references will be visible to the object
        // that toyota references


        // if we want to change something inside the object that a variable references
        // we can easily call an auxiliary function that will copy the reference inside
        // the formal parameter of the function and will reference the same memory zone
        Car bmw = new Car("BMW X6", "blue");
        System.out.println("This is the bmw: " + bmw);
        changeModelAndColor(bmw,"Mercedes AMG", "silver");
        System.out.println("This is the mercedes: " + bmw + "\n\n");

        // if we change the reference inside the called function, i.e. making the formal
        // parameter of the function reference another memory zone via instantiating a new object
        // the modification will not be visible outside the function as the formal parameter has no link
        // to the value of the original reference that we're copying from (remember double pointers in C are used
        // to achieve this effect

        bmw = new Car("BMW series 3", "red");
        System.out.println("This is the bmw: " + bmw);
        changeReference(bmw,"Mercedes AMG", "silver");
        System.out.println("Will this be a mercedes now??!! " + bmw);
    }
}
