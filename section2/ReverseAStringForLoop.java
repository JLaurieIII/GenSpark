package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAStringForLoop implements Assignment {
    public String solution(String str) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (str.length() == 0) {
            return "";
        }
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
