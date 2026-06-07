package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.add(2, 3);

        int expectedResult = Integer.parseInt(
                System.getProperty("expectedResult", "5")
        );

        assertEquals(expectedResult, actualResult);
    }
}