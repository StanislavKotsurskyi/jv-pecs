package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private String type;

    public Truck() {
    }

    public Truck(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
