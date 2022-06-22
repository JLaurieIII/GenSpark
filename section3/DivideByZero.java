package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class DivideByZero implements Assignment {
    public Object solution(int one, int two) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try {
            int answer = one / two;
            return answer;
        } catch (Exception e) {
            return "Caught Exception: Divide by zero";
        }
    }
}
