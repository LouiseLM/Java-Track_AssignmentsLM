package Iterations_02.Assignment_2;

public class Zoo {
    public double calculatePrice(Person person) {
        int age = person.getAge();
        if (age <= 5) {
            return 0;
        } else if (age <= 12) {
            return 5;
        } else {
            return 15;
        }
    }
}
