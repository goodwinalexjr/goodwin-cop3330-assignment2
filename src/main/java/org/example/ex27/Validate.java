/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex27;

import java.util.Scanner;

public class Validate {
    private static final Scanner sc = new Scanner(System.in);

    private static String fName;
    private static String lName;
    private static String Zip;
    private static String employeeID;

    public static void main (String[] args){

        userInput();

        ValidateInputs vi = new ValidateInputs();

        String id = vi.validateInput(fName, lName, Zip, employeeID);


        System.out.println(id);
    }

    public static void userInput(){
        System.out.println("Enter the First Name: ");
        fName = sc.next();

        System.out.println("Enter the Last Name: ");
        lName = sc.next();

        System.out.println("Enter the Zip Code: ");
        Zip = sc.next();

        System.out.println("Enter the Employee ID: ");
        employeeID = sc.next();
    }




}
