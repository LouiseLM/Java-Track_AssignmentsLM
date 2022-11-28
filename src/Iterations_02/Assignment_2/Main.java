package Iterations_02.Assignment_2;

public class Main {
    static Zoo zoo = new Zoo();

    public static void main(String[] args) {
        Person person1 = new Person("Macbeth", 3);
        System.out.println(zoo.calculatePrice(person1)); // 0

        Person person2 = new Person("Cleopatra", 10);
        System.out.println(zoo.calculatePrice(person2)); // 5

        Person person3 = new Person("John Doe", 50);
        System.out.println(zoo.calculatePrice(person3)); // 15
    }
}
