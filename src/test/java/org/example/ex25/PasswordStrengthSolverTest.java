package org.example.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthSolverTest {

    @Test
    void is_passwordStrength_very_weak() {

        PasswordStrengthSolver pss = new PasswordStrengthSolver();

        int actual = pss.passwordStrength("123456");
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void is_passwordStrength_weak() {

        PasswordStrengthSolver pss = new PasswordStrengthSolver();

        int actual = pss.passwordStrength("abcdef");
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void is_passwordStrength_strong() {

        PasswordStrengthSolver pss = new PasswordStrengthSolver();

        int actual = pss.passwordStrength("2Teraforest");
        int expected = 3;

        assertEquals(expected, actual);

    }
    @Test
    void is_passwordStrength_very_strong() {

        PasswordStrengthSolver pss = new PasswordStrengthSolver();

        int actual = pss.passwordStrength("2!Teraforest");
        int expected = 4;

        assertEquals(expected, actual);

    }
}