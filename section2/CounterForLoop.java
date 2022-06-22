package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CounterForLoop implements Assignment {
    public String solution(int count) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        String countdown = "";

        for (int i = count; i >= 0; i--) {
            countdown = countdown + String.valueOf(i);
        }

        /* while (count >= 0) {
            countdown = countdown + String.valueOf(count);
            count--;
        } */

        return countdown;
    }
}
