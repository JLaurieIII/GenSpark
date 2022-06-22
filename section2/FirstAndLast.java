package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class FirstAndLast implements Assignment {
    public boolean solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (word.length() == 0) {
            return true;
        } else if (word.length() == 1) {
            return true;
        } else {
            char firstChar = word.charAt(0);
            int n = word.length();
            char lastChar = word.charAt(n - 1);

            if (firstChar == lastChar) {
                return true;
            } else {
                return false;
            }
        }
    }
}
