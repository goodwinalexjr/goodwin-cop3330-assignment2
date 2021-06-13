/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex27;

public class ValidateInputs {

    private String returnString = "";
    private String tempString = "";
    private int errors;

    String validateInput(String fName, String lName, String Zip, String employeeID){

        returnString = validatefName(fName) + validatelName(lName) + validateZip(Zip) + validateEmployee(employeeID);


        if(errors == 0){
            returnString = "There were no errors found.";
        }
        return returnString;
    }

    String validatefName(String fName){
        tempString = "";
        if(fName.length() <= 2){
            tempString = "The first name must be at least 2 characters long.\n";
            errors++;
            if(fName.length() == 0){
                tempString = tempString + "The first name must be filled in.\n";
                errors++;
            }
        }
        return tempString;
    }
    String validatelName(String lName){
        tempString = "";
        if(lName.length() <= 2){
            tempString = "The last name must be at least 2 characters long.\n";
            errors++;
            if(lName.length() == 0){
                tempString = tempString + "The last name must be filled in.\n";
                errors++;
            }
        }
        return tempString;
    }
    String validateZip(String Zip){
        tempString = "";
        char zipArr[] = Zip.toCharArray();
        int arrLen = Zip.length();
        for(int i = 0; i < arrLen; i++){
            if(Character.isLetter(zipArr[i]) == true){
                errors++;
                tempString = "The zipcode must be a 5 digit number.\n";
                break;
            }
        }
        return tempString;
    }
    String validateEmployee(String employeeID){
        tempString = "";
        String specialCharacters = "-";
        char employeeIDArr[] = employeeID.toCharArray();
        int arrLen = employeeID.length();
        if(arrLen == 7) {
            for (int i = 0; i < arrLen; i++) {
                if (i <= 1) {
                    if (Character.isLetter(employeeIDArr[i]) == true) {
                        continue;
                    } else {
                        errors++;
                        tempString = "The employee ID must be in the format of AA-1234.\n";
                        break;
                    }
                }
                if (i == 2) {
                    if (specialCharacters.contains(Character.toString(employeeIDArr[i]))) {
                        continue;
                    } else {
                        errors++;
                        tempString = "The employee ID must be in the format of AA-1234.\n";
                        break;
                    }
                }
                if (i >= 3) {
                    if (Character.isDigit(employeeIDArr[i]) == true) {
                        continue;
                    } else {
                        errors++;
                        tempString = "The employee ID must be in the format of AA-1234.\n";
                        break;
                    }
                }

            }
        }
        else{
            errors++;
            tempString = "The employee ID must be in the format of AA-1234.\n";
        }
        return tempString;
    }



}
