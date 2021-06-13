/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex32;

import java.util.Scanner;

public class GuessGame {

    String GuessingGameStart(int GuessNumber){
       int userGuess = 0;
       int totalGuesses = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("I have my number. What is your guess? ");
        while(userGuess != GuessNumber){
            totalGuesses++;
            String Guess = sc.nextLine();
            if(!Guess.matches("[0-9]+")){
                System.out.println("Invalid entry\n What is your Guess?");
            }
            else{
                userGuess = Integer.parseInt(Guess);
                if(userGuess > GuessNumber){
                    System.out.println("Too high. Guess again:");
                }
                if(userGuess < GuessNumber){
                    System.out.println("Too low. Guess again:");
                }
                if(userGuess == GuessNumber){
                    break;
                }
            }

        }
        System.out.println("You got it in " + totalGuesses + " Guesses!\n\nWould you like to play again?(Y/N)");
        String playAgain = sc.next();
        return playAgain;
    }
}
