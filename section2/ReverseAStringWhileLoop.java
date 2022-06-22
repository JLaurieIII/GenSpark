package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringWhileLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int length = str.length() - 1;
        String reverse = "";

        while (length >= 0) {
            reverse = reverse + str.charAt(length);
            length--;
        }

        return reverse;
    }
}
