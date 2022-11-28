package Iterations_02.Assignment_1;

public class Door {
    private final double height;
    private final double width;
    private boolean open;

    public Door(double height, double width) {
        this.height = height;
        this.width = width;
        this.open = false;
    }

    public void openDoor() {
        if (!open) {
            open = true;
            System.out.println("Opening door.");
        } else {
            System.out.println("The door is already open.");
        }
    }

    public void closeDoor() {
        if (open) {
            open = false;
            System.out.println("Closing door");
        } else {
            System.out.println("The door is already closed.");
        }
    }

    public void printDoor() {
        if (open) {
            System.out.println("The door is open.");
        } else {
            System.out.println("The door is closed.");
        }
    }

    public double calculateSurface() {
        return width * height;
    }
}
