package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class FactorialComputation implements Assignment {
    public int solution(int n) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        /*
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n-1);
        }

         */


        if (n == 1) return 1;
        else return n * solution(n -1);













    }
}
