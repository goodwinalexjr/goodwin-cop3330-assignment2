package org.example.ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest {

    @Test
    void testingnumbers() {
        AddingNumbers ad = new AddingNumbers();



        int actual = ad.userInput(1);
        int expected = 5;

        assertEquals(expected, actual);
    }

}