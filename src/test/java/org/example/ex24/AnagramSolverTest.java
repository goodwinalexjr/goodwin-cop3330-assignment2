package org.example.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramSolverTest {

    @Test
    void isAnagram_retuns_false_less_words() {

        AnagramSolver detector = new AnagramSolver();

        boolean actual = detector.isAnagram("no", "tone");

        assertFalse(actual);
    }
    @Test
    void isAnagram_retuns_false() {

        AnagramSolver detector = new AnagramSolver();

        boolean actual = detector.isAnagram("node", "tone");

        assertFalse(actual);
    }
    @Test
    void isAnagram_retuns_true() {

        AnagramSolver detector = new AnagramSolver();

        boolean actual = detector.isAnagram("note", "tone");

        assertTrue(actual);
    }
}