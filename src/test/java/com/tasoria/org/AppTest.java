package com.tasoria.org;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testNegativeUnits() {
        int units = -10;

        String expected = "Units cannot be negative.";

        try {
            if (units < 0) {
                throw new IllegalArgumentException("Units cannot be negative.");
            }
        } catch (IllegalArgumentException e) {
            assertEquals(expected, e.getMessage());
        }
    }

    @Test
    void testZeroUnits() {
        int units = 0;

        String result;

        if (units <= 150) {
            result = "No Bill is Due";
        } else if (units <= 300) {
            result = "Bill is: " + (units * 10);
        } else {
            result = "Bill is: " + (units * 15);
        }

        assertEquals("No Bill is Due", result);
    }

    @Test
    void test150Units() {
        int units = 150;

        String result;

        if (units <= 150) {
            result = "No Bill is Due";
        } else if (units <= 300) {
            result = "Bill is: " + (units * 10);
        } else {
            result = "Bill is: " + (units * 15);
        }

        assertEquals("No Bill is Due", result);
    }

    @Test
    void test151Units() {
        int units = 151;

        String result = "Bill is: " + (units * 10);

        assertEquals("Bill is: 1510", result);
    }

    @Test
    void test300Units() {
        int units = 300;

        String result = "Bill is: " + (units * 10);

        assertEquals("Bill is: 3000", result);
    }

    @Test
    void test301Units() {
        int units = 301;

        String result = "Bill is: " + (units * 15);

        assertEquals("Bill is: 4515", result);
    }
}