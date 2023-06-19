package math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator c;

    @BeforeEach
    void init() {
        c = new Calculator();
    }

    @Test
    @DisplayName("add")
    void add() {
        assertEquals(17.0f, c.add(6.5f, 10.5f));
    }

    @Test
    @DisplayName("add negative")
    void addNegative() {
        assertEquals(10.5f, c.add(12.5f, -2.0f));
    }

    @Test
    @DisplayName("subtr")
    void subtract() {
        assertEquals(0.5f, c.subtract(3.0f, 2.5f));
    }

    @Test
    @DisplayName("subtr negative")
    void subtractNegative() {
        assertEquals(15.5f, c.subtract(10.0f, -5.5f));
    }


    @Test
    @DisplayName("divide")
    void divide() {
        assertEquals(20.1f, c.divide(40.2f, 2.0f));
    }

    @Test
    @DisplayName("divide by 0 ")
    void divideZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> c.divide(30.0f, 0.0f)
        );
    }

    @Test
    @DisplayName("multip")
    void multiply() {
        assertEquals(4.22f, c.multiply(2.11f, 2.0f));
    }
    @Test
    @DisplayName("multip negative")
    void multiplyNegative() {
        assertEquals(-270.0f, c.multiply(45.0f, -6.0f));
    }

}