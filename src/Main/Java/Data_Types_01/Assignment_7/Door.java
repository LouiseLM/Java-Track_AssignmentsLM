package Main.Java.Data_Types_01.Assignment_7;

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
        }
    }

    public void closeDoor() {
        if (open) {
            open = false;
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
