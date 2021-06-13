/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex26;

import java.util.Scanner;

public class PaymentCalculator {

    int calculateMonthsUntilPaidOff(double balance, double apr, double monthlyPayments){

        double aprpercent = apr / 100;
        double dailyAprPercent = aprpercent / 365;


        double power = (1 - (Math.pow((1 + dailyAprPercent), 30)));
        double base = (balance / monthlyPayments);
        double monthlydoublep1 = (base * power);
        monthlydoublep1 = 1 + monthlydoublep1;
        double monthlydoublep2 = Math.log10(monthlydoublep1);
        double monthlydouble = monthlydoublep2 / (Math.log10(1 + dailyAprPercent));
        monthlydouble = -.033333333333 * monthlydouble;


        int monthly =(int) Math.round(monthlydouble + .5);

        return monthly;
    }
}
