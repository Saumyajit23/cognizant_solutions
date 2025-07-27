package com.example.aaa_patterns;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

        @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("🔧 Setup: New Calculator instance created.");
    }

       @After
    public void tearDown() {
        System.out.println("🧹 Teardown: Test completed.");
    }

       @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

        public void testDivision() {
        // Arrange
        int a = 10;
        int b = 2;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result);
    }
}
