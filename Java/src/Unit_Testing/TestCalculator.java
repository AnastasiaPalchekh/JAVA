package TEST;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class  TestCalculator {

    private final Calculator calculator = new Calculator();

    @Test
    void addTest() {
        calculator.add (2,3);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void BufferOverflowTest() {
        Assertions.assertTrue(calculator.add(9223372036854775807L,9223372036854775807L)<0);
    }
    @Test
    void addwithresultTest() {
        calculator.add(2,3);
        calculator.add(255);
        assertEquals(260,calculator.getResult());
    }

    @Test
    void subTest() {
        calculator.sub(10,3);
        assertEquals(7, calculator.getResult());
    }

    @Test
    void subwithresultTest() {
        calculator.sub(10,3);
        calculator.sub(2);
        assertEquals(5,calculator.getResult());
    }
    @Test
    void mulTest() {
        calculator.mul(2,3);
        assertEquals(6,calculator.getResult());
    }

    @Test
    void divTest() {
        calculator.div(6,0);
        assertEquals(2,calculator.getResult());
    }

    @Test
    void divZeroResultTest() {
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculator.div(6,0));
        assertEquals(exception.getMessage(), exception.getMessage());
    }


}
