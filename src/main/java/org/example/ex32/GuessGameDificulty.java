/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex32;
import java.util.Random;
import java.util.Scanner;

public class GuessGameDificulty {

    String guessingGameStart(String playGame){

        GuessGame gg = new GuessGame();
        Random rand = new Random();

        int guessNumber = rand.nextInt(dificulty() + 1);
        String playagain = gg.GuessingGameStart(guessNumber);
        return playagain;
    }


    int dificulty() {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        String dificulty;
        int dificulties = 0;

        while (x == 0) {
            int y = 0;
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            dificulty = sc.next();
            char difarr[] = dificulty.toCharArray();
            int arrLen = dificulty.length();

            for (int i = 0; i < arrLen; i++) {
                if (Character.isLetter(difarr[i]) == true) {
                    y = 1;
                    break;
                }
            }
            if (y == 0) {
                dificulties = Integer.parseInt(dificulty);
                if (dificulties == 0) {
                    x = 0;
                } else if (dificulties >= 4) {
                    x = 0;
                } else {
                    x = 1;
                }
            }
        }
        if(dificulties == 1){
            dificulties = 10;
        }
        if(dificulties == 2){
            dificulties = 100;
        }
        if(dificulties == 3){
            dificulties = 1000;
        }
        return dificulties;
    }
}
