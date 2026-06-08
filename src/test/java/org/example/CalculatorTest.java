package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    @Feature("Calculator")
    @Story("Addition")
    @Description("Verify that the calculator can add two numbers correctly using a Jenkins parameter as expected result")
    public void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.add(2, 3);

        int expectedResult = Integer.parseInt(
                System.getProperty("expectedResult", "5")
        );

        assertEquals(expectedResult, actualResult);
    }
}