package Main.Java.Testing_Exercises;

public class Calculator {
    public double multiply(double d1, double d2) {
        return d1 * d2;
    }

    public double divide(double d1, double d2) {
        if (d1 == 0 || d2 == 0) {
            throw new RuntimeException("You cannot divide by 0");
        } else {
            return d1 / d2;
        }
    }

    public double sum(double d1, double d2) {
        return d1 + d2;
    }

    public double subtract(double d1, double d2) {
        return d1 - d2;
    }
}
