package lab03.aggregation;

import java.util.ArrayList;

public class PorschePanamera {
    // composition aka strong association, engines shouldn't be created if they don't power a car
    private Engine engine = new Engine(4993, 0, "Deutsche auto motor");

    // aggregation aka weak association, people without a driving licence can still be passengers if they are not in a car
    private ArrayList<String> passengers;

    public PorschePanamera(ArrayList<String> passengers) {
        this.passengers = passengers;
    }

    public PorschePanamera addPassenger(String passenger) {
        passengers.add(passenger);
        return this;
    }

    public Engine getEngine() {
        return engine;
    }
}
