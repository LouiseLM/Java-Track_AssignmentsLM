package Main.Java.Airport_03;

public class Airplane {
    private final int id;
    private final int max_passengers;
    private int current_passengers;
    private boolean flying = false;
    private int cruise_speed;

    public Airplane(int id, int max_passengers) {
        this.id = id;
        this.max_passengers = max_passengers;
    }

    public void loadPassengers(int passengers) {
        this.current_passengers = passengers;
        System.out.println(passengers + " passengers have been loaded");
    }

    public void unloadPassengers() {
        this.current_passengers = 0;
        System.out.println("All passengers have been unloaded");
    }

    public void takeOff() {
        if (!flying) {
            flying = true;
            System.out.println("Plane " + this.id + " has taken off");
        } else {
            System.out.println("Plane " + this.id + " is already flying.");
        }
    }

    public void land() {
        if (flying) {
            flying = false;
            System.out.println("Plane " + this.id + " has landed");
        } else {
            System.out.println("Plane " + this.id + " is not currently flying.");
        }
    }
}
