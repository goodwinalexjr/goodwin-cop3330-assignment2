/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex30;

public class MultiplicationTableCalc {
    void tablecalulation() {
        int multiplication = 0;
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                multiplication = i * j;
                output(multiplication);
            }
            System.out.println();
        }
    }

    void output(int multiplication){
        System.out.printf("%10d", multiplication);
    }
}
