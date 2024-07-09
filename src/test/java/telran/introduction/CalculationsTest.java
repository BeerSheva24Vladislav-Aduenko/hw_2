package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
@Test
    void sumTest() {
        assertEquals(4, sum(2, 2));
    }

@Test
    void multiplyTest() {
        assertEquals(8, multiply(4, 2));
    }

@Test 
    void divideTest() {
        assertEquals(4, divide(12, 3));
        assertThrowsExactly(ArithmeticException.class, () -> divide(10, 0));
    }

@Test
    void subtractTest(){
     assertEquals(5, subtract(10,5));
    }  

@Test 
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(-123));
        assertEquals(6, sumOfDigits(123));
        assertEquals(0, sumOfDigits(0));
        
    }

@Test
    void maxDigitTest() {
        assertEquals(4, maxDigit(-1234));
        assertEquals(3, maxDigit(123));
        assertEquals(0, maxDigit(0));
    }

@Test 
    void isDividedOnTest() {
        assertTrue(isDividedOn(12, 2));
        assertTrue(isDividedOn(-10, 2));
        assertFalse(isDividedOn(12, 0));
        assertFalse(isDividedOn(10, 3));
    }

}