package org.example.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateCalculatorTest {

    @Test
    void hearrate_calculation_test() {
        HeartRateCalculator hrc = new HeartRateCalculator();

        int actual = hrc.Hearrate(65, 22, 55);
        int expected = 138;

        assertEquals(expected, actual);
    }
}