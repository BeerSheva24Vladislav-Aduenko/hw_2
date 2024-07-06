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
    }

@Test
    void subtractTest(){
     assertEquals(5, subtract(10,5));
    }  

@Test 
    void sumOfDigitsTest() {
        assertEquals(6, sumOfDigits(-123));
    }

@Test
    void maxDigitTest() {
        assertEquals(3, maxDigit(-123));
    }

@Test 
    void isDividedOnTest() {
        assertEquals(false, isDividedOn(-8, 3));
    }

}