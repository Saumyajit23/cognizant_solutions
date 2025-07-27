package com.example.junit_setup;

import org.junit.Test;
import static org.junit.Assert.*;

public class calculatortest {

    @Test
    public void testAdd() {
        calculator calc = new calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }
}
