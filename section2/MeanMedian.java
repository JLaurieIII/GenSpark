package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class MeanMedian implements Assignment {
    public String solution(int a, int b, int c) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        int sum = a + b + c;
        float floatSum = (float)sum;
        int total = 3;
        float mean = floatSum / total;
        String stringMean = String.valueOf(mean);


        int median;
        if (a > b && a > c) {
            if (b > c) {
                median = b;
            } else {
                median = c;
            }
        }
        else if (b > a && b > c) {
            if (a > c) {
                median = a;
            } else {
                median = c;
            }
        }
        else {
            if (a > b) {
                median = a;
            } else {
                median = b;
            }
        }
        String stringMedian = String.valueOf(median);
        return stringMean + " " + stringMedian;
    }
}
