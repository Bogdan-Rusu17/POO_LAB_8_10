package lab03.aggregation;

public class Engine {
    private int capacity;
    private int kilometers;
    private String model;

    public Engine(int capacity, int kilometers, String model) {
        this.capacity = capacity;
        this.kilometers = kilometers;
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
