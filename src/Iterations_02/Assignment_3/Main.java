package Iterations_02.Assignment_3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers [4] = 5;

        System.out.println("For each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("For loop:");
        // Can be replaced with enhanced for loop which makes this the same as for-each above.
        // Left as is to comply with assignment requirements
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("-------");

        int[] numbers2 = new int[5];

        for (int i = 1; i<numbers2.length; i++) {

        }
    }
}
