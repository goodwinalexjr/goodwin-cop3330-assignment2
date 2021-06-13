package org.example.ex26;

import org.example.ex25.PasswordStrengthSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator pc  = new PaymentCalculator();

        int actual = pc.calculateMonthsUntilPaidOff(5000,12,100);
        int expected = 70;

        assertEquals(expected, actual);
    }
}