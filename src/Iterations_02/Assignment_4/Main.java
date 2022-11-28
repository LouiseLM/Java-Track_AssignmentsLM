package Iterations_02.Assignment_4;

public class Main {
    public static void main(String[] args) {
        // Pyramids in height and width of specified number
        printPyramid(5);
        printPyramid(8);
    }

    public static void printPyramid(int size) {
        String line = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
