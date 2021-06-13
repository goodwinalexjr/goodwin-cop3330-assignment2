/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex28;



import java.util.Scanner;

public class AddingNumbers {
    private static final Scanner sc = new Scanner(System.in);

    private static int number;


    public static void main (String[] args){
        for(int i = 0; i < 5; i++) {
            userInput(0);
        }
        System.out.println("The total is " + number);
    }
    public static int userInput(int adding){


            System.out.println("Enter a number: ");
            adding = sc.nextInt();
            number = number + adding;

            return number;

    }

}
