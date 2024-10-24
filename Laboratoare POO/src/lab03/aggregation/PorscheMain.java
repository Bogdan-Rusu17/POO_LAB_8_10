package lab03.aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PorscheMain {
    public static void main(String[] args) {
        ArrayList<String> passengers = new ArrayList<>(Arrays.asList("Dan", "George"));
        PorschePanamera dreamCar = new PorschePanamera(passengers);
        dreamCar.addPassenger("John").addPassenger("Lucy");

        // if we delete the car, aka equal its reference to null, GC will intervene as some point and
        // deallocate the object, we lose the engine object

        Engine engine = dreamCar.getEngine();
        System.out.println(engine);
        dreamCar = null;

        // calling dreamCar.getEngine() will result in an error now

        // we won't lose the reference to passengers because they exist out of the context of the porsche object
        System.out.println(passengers);

    }
}
