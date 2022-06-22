package genspark.assignments.section4;

import genspark.assignments.Assignment;

public class SumTheArray implements Assignment {
    public int solution(int[] numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        int sum = 0;
        for (int count: numbers) {
            sum += count;
            }
        return sum;
    }
}
