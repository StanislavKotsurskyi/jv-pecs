package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String color;
    private String type;

    public Excavator() {
    }

    public Excavator(String color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
