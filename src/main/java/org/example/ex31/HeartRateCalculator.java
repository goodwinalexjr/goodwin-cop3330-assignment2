/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex31;

public class HeartRateCalculator {

    int Hearrate(int restingPulse, int age, double intensity){
        double intensityPercentage = intensity / 100;



        double returnrate = 220 - age;
        returnrate = returnrate - restingPulse;
        returnrate = returnrate * intensityPercentage;
        returnrate = returnrate + restingPulse;

        int returnrates =(int) Math.round(returnrate);
        return returnrates;
    }
}
