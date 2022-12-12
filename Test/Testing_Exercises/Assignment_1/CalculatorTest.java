package Testing_Exercises.Assignment_1;

import Main.Java.Testing_Exercises.Assignment_1.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldMultiply() {
        Calculator calculator = new Calculator();

        assertEquals(2.0, calculator.multiply(1, 2));
        assertEquals(162.0, calculator.multiply(27, 6));
        assertEquals(404.2, calculator.multiply(9.4, 43));
    }

    @Test
    void shouldDivide() {
        Calculator calculator = new Calculator();

        assertEquals(0.47777777777777775, calculator.divide(4.3, 9));
        assertEquals(56.4, calculator.divide(84.6, 1.5));
        assertEquals(4.5, calculator.divide(9, 2));
    }

    @Test
    void shouldSum() {
        Calculator calculator = new Calculator();

        assertEquals(3.0, calculator.sum(1, 2));
        assertEquals(14.0, calculator.sum(9, 5));
        assertEquals(9.0, calculator.sum(6, 3));
    }

    @Test
    void shouldSubtract() {
        Calculator calculator = new Calculator();

        assertEquals(-3.0, calculator.subtract(6, 9));
        assertEquals(-3.0, calculator.subtract(6, 9));
        assertEquals(8.0, calculator.subtract(45, 37));
    }
}