package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class ReverseAnInteger implements Assignment {
    public String solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        String intToString = String.valueOf(number);
        String reverse = "";

        for(int i = (intToString.length() - 1); i >= 0; i--) {

            reverse = reverse + intToString.charAt(i);
        }

        return reverse;
    }
}
