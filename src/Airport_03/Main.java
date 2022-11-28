package Airport_03;

public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane(1, 500);
        Airplane plane2 = new Airplane(2, 100);

        plane1.loadPassengers(350); // "350 passengers have been loaded"
        plane2.loadPassengers(78); // "78 passengers have been loaded"

        plane1.takeOff(); // "Plane 1 has taken off"
        plane2.takeOff(); // "Plane 2 has taken off"

        plane1.land(); // "Plane 1 has landed"
        plane2.land(); // "Plane 2 has landed"

        // "All passengers have been unloaded"
        plane1.unloadPassengers();
        plane2.unloadPassengers();
    }
}
