package Data_Types_01.Assignment_5;

public class Main {
    public static void main(String[] args) {
        System.out.println(multiply(4, 8)); // 32
        System.out.println(multiply(8, 10) * multiply(3, 60)); // 14400
    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
