package org.example.ex24;

import java.util.Scanner;

public class Anagram {

    private static final Scanner sc = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args){

        userInput();

        AnagramSolver as = new AnagramSolver();

        System.out.println(output(as.isAnagram(word1, word2)));
    }

    public static void userInput(){
        System.out.println("Enter the first word: ");
        word1 = sc.next();

        System.out.println("Enter the second word: ");
        word2 = sc.next();
    }

    public static String output(boolean isAnagram){
        if(isAnagram){
            return "is anagram";
        }
        else {
            return "is not anagram";
        }
    }
}
