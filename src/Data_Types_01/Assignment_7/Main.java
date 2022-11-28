package Data_Types_01.Assignment_7;

public class Main {
    public static void main(String[] args) {
        Door door1 = new Door(200, 80);
        Door door2 = new Door(240.2, 200.3);

        door1.openDoor();
        door2.openDoor();

        door1.closeDoor();
        door2.closeDoor();

        //"The door is closed"
        door1.printDoor();
        door2.printDoor();

        System.out.println(door1.calculateSurface()); //16000.0
        System.out.println(door2.calculateSurface()); //48112.06
    }
}
