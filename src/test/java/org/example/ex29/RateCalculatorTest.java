package org.example.ex29;

import org.example.ex27.ValidateInputs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateCalculatorTest {

    @Test
    void rateCalculations() {
        RateCalculator rc = new RateCalculator();

        int actual= rc.rateCalculations(4);
        int expected = 18;

        assertEquals(expected, actual);
    }
}