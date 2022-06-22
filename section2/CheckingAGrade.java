package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckingAGrade implements Assignment {
    public String solution(int grade) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else {
            return "FAILURE";
        }
    }
}
