package genspark.assignments.section3;

import genspark.assignments.Assignment;

public class ParsingAnInteger implements Assignment {
    public Object solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        try {
            int answer;
            answer = Integer.parseInt(word);
            return answer;
        } catch (Exception e) {
            return "Caught Exception: Number Format Exception";
        }
    }
}
