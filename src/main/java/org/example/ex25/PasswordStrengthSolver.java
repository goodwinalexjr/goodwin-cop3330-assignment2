package org.example.ex25;

public class PasswordStrengthSolver {

    int passwordStrength(String password){
        int strength = 0;


        if(checkForNumbers(password)){
            strength++;
            if(checkForLetters(password)){
                strength++;
            }
            if(password.length() >= 8){
                strength++;
            }
            if(checkForSpecialCharacters(password)){
                strength++;
            }
        }
        else if(checkForLetters(password)){
            strength = 2;
        }

        return strength;
    }

    boolean checkForNumbers(String password){
        char passwordArray[] = password.toCharArray();
        int arrLen = password.length();
        for(int i = 0; i < arrLen; i++){
            if(Character.isDigit(passwordArray[i]) == true){
                return true;
            }
        }
        return false;
    }

    boolean checkForLetters(String password){
        char passwordArray[] = password.toCharArray();
        int arrLen = password.length();
        for(int i = 0; i < arrLen; i++){
            if(Character.isLetter(passwordArray[i]) == true){
                return true;
            }
        }
        return false;
    }

    boolean checkForSpecialCharacters(String password){
        String specialCharacters = " !\"#$%&'()*+,-./;:<>=?@[]\\^_`{}|~";
        char passwordArray[] = password.toCharArray();
        int arrLen = password.length();
        for(int i = 0; i < arrLen; i++){
            if(specialCharacters.contains(Character.toString(passwordArray[i]))){
                return true;
            }
        }
        return false;
    }

}

