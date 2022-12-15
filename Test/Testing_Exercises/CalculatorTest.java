package Testing_Exercises;

import Main.Java.Testing_Exercises.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldMultiply() {
        Calculator calculator = new Calculator();

        assertEquals(2.0, calculator.multiply(1, 2), "error");
        assertEquals(162.0, calculator.multiply(27, 6), "error");
        assertEquals(404.2, calculator.multiply(9.4, 43), "error");
    }

    @Test
    void shouldDivide() {
        Calculator calculator = new Calculator();

        assertEquals(0.47777777777777775, calculator.divide(4.3, 9), "error");
        assertEquals(56.4, calculator.divide(84.6, 1.5), "error");
        assertEquals(4.5, calculator.divide(9, 2), "error");
    }

    @Test
    void divideShouldThrow() {
        Calculator calculator = new Calculator();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class, () -> calculator.divide(0, 7), "error");

        assertEquals("You cannot divide by 0", thrown.getMessage(), "error");
    }

    @Test
    void shouldSum() {
        Calculator calculator = new Calculator();

        assertEquals(3.0, calculator.sum(1, 2), "error");
        assertEquals(14.0, calculator.sum(9, 5), "error");
        assertEquals(9.0, calculator.sum(6, 3), "error");
    }

    @Test
    void shouldSubtract() {
        Calculator calculator = new Calculator();

        assertEquals(-3.0, calculator.subtract(6, 9), "error");
        assertEquals(-3.0, calculator.subtract(6, 9), "error");
        assertEquals(8.0, calculator.subtract(45, 37), "error");
    }
}