package Main.Java.Iterations_02.Assignment_1;

public class Main {
    public static void main(String[] args) {
        Door door1 = new Door(200, 80);
        Door door2 = new Door(240.2, 200.3);

        //"Opening door"
        door1.openDoor();
        door2.openDoor();

        //"Closing door"
        door1.closeDoor();
        door2.closeDoor();

        //"The door is closed"
        door1.printDoor();
        door2.printDoor();

        System.out.println(door1.calculateSurface()); //16000.0
        System.out.println(door2.calculateSurface()); //48112.06
    }
}
