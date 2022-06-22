package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class IncrementWhileLoop implements Assignment {
    public String solution(int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String countdown = "";
        if (from > to) {
            return "";
        } else if (to == from) {
            String intToString = String.valueOf(to);
            countdown = intToString;
            return countdown;
        } else {
            while (to >= from) {
                countdown = countdown + String.valueOf(from);
                from ++;
            }
            return countdown;
        }
    }
}
