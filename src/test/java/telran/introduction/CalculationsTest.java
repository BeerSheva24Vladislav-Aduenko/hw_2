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
        assertEquals(3, divide(9, 3));
    }

@Test
    void subtractTest(){
     assertEquals(5, subtract(10,5));
    }  

@Test 
    void sumOfDigitsTest() {
        assertEquals(21, sumOfDigits(123456));
    }

@Test
    void maxDigitTest() {
        assertEquals(9, maxDigit(123495678));
    }

@Test 
    void isDividedOnTest() {
        assertEquals(true, isDividedOn(9, 3));
    }

}