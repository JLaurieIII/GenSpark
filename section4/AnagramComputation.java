package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class AnagramComputation implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        int lengthOfA = word1.length();
        int lengthOfB = word2.length();

        if (lengthOfA != lengthOfB) return false;
        if (word1.length() == 0 || word2.length() == 0) return false;
        if (word1.length() == 1 || word2.length() == 1) return false;
        if (word1.equals(word2)) return false;

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();


        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one, two)) {
            return true;
        } else {
            return false;
        }


    }

}
