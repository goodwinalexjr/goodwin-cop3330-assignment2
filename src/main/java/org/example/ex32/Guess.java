/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example.ex32;

public class Guess {

    public static void main (String[] args){

        GuessGameDificulty ggd = new GuessGameDificulty();
        String playGame = "Y";

        while(playGame == "y" || playGame == "Y"){
            playGame = ggd.guessingGameStart(playGame);
        }



    }
}
