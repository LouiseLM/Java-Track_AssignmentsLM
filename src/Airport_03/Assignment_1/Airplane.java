package Airport_03.Assignment_1;

public class Airplane {
    private int id;
    private int max_passengers;
    private int current_passengers;
    private boolean flying = false;
    private int cruise_speed;

    public Airplane(int id, int max_passengers) {
        this.id = id;
        this.max_passengers = max_passengers;
    }

    public void loadPassengers(int passengers) {
        this.current_passengers = passengers;
        System.out.println("The passengers have been loaded");
    }

    public void unloadPassengers() {
        this.current_passengers = 0;
        System.out.println("The passengers have been unloaded");
    }

    public void takeOff() {
        if (!flying) {
            flying = true;
        } else {
            System.out.println("The plane is already flying.");
        }
    }

    public void land() {
        if (flying) {
            flying = false;
        } else {
            System.out.println("The plane is not currently flying.");
        }
    }
}
