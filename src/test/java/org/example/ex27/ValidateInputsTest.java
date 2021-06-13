package org.example.ex27;

import org.example.ex25.PasswordStrengthSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputsTest {

    @Test
    void validateInput_no_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("John","Johnson","55555","TK-4321");
        String expected = "There were no errors found.";

        assertEquals(expected, actual);
    }

    @Test
    void validateInput_fName_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("","Johnson","55555","TK-4321");
        String expected = "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_lName_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("john","","55555","TK-4321");
        String expected = "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_zip_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("john","Johnson","ABCD","TK-4321");
        String expected = "The zipcode must be a 5 digit number.\n";

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_ID_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("John","Johnson","55555","T12-4321");
        String expected = "The employee ID must be in the format of AA-1234.\n";

        assertEquals(expected, actual);
    }
    @Test
    void validateInput_all_errors() {
        ValidateInputs vs = new ValidateInputs();

        String actual = vs.validateInput("a","","ABCDE","T12-4321");
        String expected = "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\nThe last name must be filled in.\n" +
                "The zipcode must be a 5 digit number.\nThe employee ID must be in the format of AA-1234.\n";

        assertEquals(expected, actual);
    }
}