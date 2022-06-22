package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAStringReduce implements Assignment {

    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        String reversed = word.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);

        return reversed;

         */

        String reversed = word.chars()
                .mapToObj(c -> (char)c)
                .reduce("", (a,b) -> b + a, (s1,s2) -> s2 + s1);

        return reversed;







    }
}
