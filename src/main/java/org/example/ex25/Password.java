package org.example.ex25;

import java.util.Scanner;

public class Password {

    private static final Scanner sc = new Scanner(System.in);

    private static String password;

    public static void main(String[] args){
        PasswordStrengthSolver pss = new PasswordStrengthSolver();

        userInput();

        int strength = pss.passwordStrength(password);


        System.out.println(output(strength));

    }

    public static void userInput(){
        System.out.println("Enter the password: ");
        password = sc.next();

    }

    public static String output(int strength){
        String passwordoutput = "";

        if(strength >= 4){
            passwordoutput = "The password " + "'" + password + "'" +  " is a very strong password.";
        }
        else if(strength == 3){
            passwordoutput = "The password " + "'" + password + "'" + " is a strong password.";
        }
        else if(strength == 2){
            passwordoutput = "The password " + "'" + password + "'" + " is a weak password.";
        }
        else{
            passwordoutput = "The password " + "'" + password + "'" + " is a very weak password.";
        }
        return passwordoutput;
    }
}
