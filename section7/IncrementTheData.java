package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IncrementTheData implements Assignment {
    public Object solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        return nums.stream().map(number -> number + 10)
                .collect(Collectors.toList());

         */

        return nums.stream()
                .map(n -> n + 10)
                .collect(Collectors.toList());






    }
}
