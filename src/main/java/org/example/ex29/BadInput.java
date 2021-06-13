/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex29;

import java.util.Scanner;

public class BadInput {

    private static final Scanner sc = new Scanner(System.in);

    private static String rate;

    public static void main (String[] args){

        RateCalculator rc = new RateCalculator();
        int rates = userInput();

        System.out.println(output(rc.rateCalculations(rates)));
    }
    public static int userInput() {

        int x = 0;


        while(x == 0) {
            int y = 0;
            System.out.println("Enter a number: ");
            rate = sc.next();
            char ratearr[] = rate.toCharArray();
            int arrLen = rate.length();

            for (int i = 0; i < arrLen; i++) {
                if (Character.isLetter(ratearr[i]) == true) {
                    y=1;
                    break;
                }

            }
            if(y==0){
                int rates = Integer.parseInt(rate);
                if(rates == 0){

                }
                else{
                    x = 1;
                }
            }
        }
        int rates = Integer.parseInt(rate);
        return rates;
    }

    public static String output(int rateCalculations){
        return "It will take " + rateCalculations + " years to double your initial investment.";
    }
}
