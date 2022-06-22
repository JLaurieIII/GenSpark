package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class MapReduce implements Assignment {
    public int[] solution(ArrayList<ArrayList<Integer>> innerNums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        int[] results =
                innerNums.stream().mapToInt( o -> o.stream().mapToInt(i -> i).reduce(0, Integer::sum)).toArray();

        return results;

         */



        int[] answer = innerNums.stream().mapToInt(i -> i.stream().mapToInt(n -> n).reduce(0, Integer::sum)).toArray();
        return answer;















    }
}
