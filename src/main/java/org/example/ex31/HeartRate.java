/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex31;

import java.util.Scanner;

public class HeartRate {

    private static final Scanner sc = new Scanner(System.in);
    private static String restingPulse;
    private static String age;
    private static double intensity = 55;

    public static void main (String[] args){



        userInput();

        output();


    }

    public static void userInput(){
        int x = 0;

        while(x == 0) {
            int y = 0;
            System.out.println("Resting Pulse: ");
            restingPulse = sc.next();
            char ratearr[] = restingPulse.toCharArray();
            int arrLen = restingPulse.length();

            for (int i = 0; i < arrLen; i++) {
                if (Character.isLetter(ratearr[i]) == true) {
                    y=1;
                    break;
                }

            }
            if(y==0){
                int rates = Integer.parseInt(restingPulse);
                if(rates == 0){

                }
                else{
                    x = 1;
                }
            }
        }
        x = 0;

        while(x == 0) {
            int y = 0;
            System.out.println("Age: ");
            age = sc.next();
            char agearr[] = age.toCharArray();
            int arrLen = age.length();

            for (int i = 0; i < arrLen; i++) {
                if (Character.isLetter(agearr[i]) == true) {
                    y=1;
                    break;
                }

            }
            if(y==0){
                int rates = Integer.parseInt(age);
                if(rates == 0){

                }
                else{
                    x = 1;
                }
            }
        }
    }
    public static void output(){
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        HeartRateCalculator hrc= new HeartRateCalculator();
        int restingPulsenumber = Integer.parseInt(restingPulse);
        int agenumber = Integer.parseInt(age);


        for(intensity = 55; intensity <= 95; intensity += 5){
            System.out.println(intensity + "%%          | " + hrc.Hearrate(restingPulsenumber,agenumber,intensity) + " bpm");
        }
    }

    }
