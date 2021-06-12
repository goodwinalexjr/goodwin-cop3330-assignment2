package org.example.ex24;

import java.util.Arrays;

public class AnagramSolver {
    boolean isAnagram(String word1, String word2){

        if(word1.length() == word2.length()) {


            char word1Array[] = word1.toCharArray();
            char word2Array[] = word2.toCharArray();

            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            String tempword1 = new String(word1Array);
            String tempword2 = new String(word2Array);

            if (tempword1.matches(tempword2)) {
                return true;
            }
        }
        return false;
    }
}
