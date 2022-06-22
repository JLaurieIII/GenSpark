package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveTheOddBalls implements Assignment {
    public Object[] solution(ArrayList<String> words) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        return words.stream().filter(w -> w.length() % 2 == 0).toArray();

         */

        return words.stream().filter(s -> s.length() % 2 == 0).toArray();


















    }
}
