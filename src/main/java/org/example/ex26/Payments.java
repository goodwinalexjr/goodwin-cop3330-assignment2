/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex26;

import java.util.Scanner;

public class Payments {

    private static final Scanner sc = new Scanner(System.in);

    private static double balance;
    private static double apr;
    private static double monthlyPayments;

    public static void main (String[] args){

        userInput();

        PaymentCalculator pc = new PaymentCalculator();

        System.out.println(output(pc.calculateMonthsUntilPaidOff(balance, apr, monthlyPayments)));
    }

    public static void userInput(){
        System.out.println("Enter your balance: ");
        balance = sc.nextDouble();

        System.out.println("Enter the APR on the card: ");
        apr = sc.nextDouble();

        System.out.println("Enter the monthly payments you can make: ");
        monthlyPayments = sc.nextDouble();
    }

    public static String output(int calculateMonthsUntilPaidOff){

    return "It will take " + calculateMonthsUntilPaidOff + " months to pay off this card.";
    }

}
