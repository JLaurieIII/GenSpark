package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CountDuplicatesWithMap implements Assignment {
    public HashMap<Integer,Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        for (int element : nums) {
            if (resultMap.containsKey(element)) {
                resultMap.put(element, resultMap.get(element) + 1);
            } else {
                resultMap.put(element, 1);
            }
        }
        return resultMap;

         */

        HashMap<Integer, Integer> answer = new HashMap<>();

        for (int num: nums) {
            if (answer.containsKey(num)) {
                answer.put(num, answer.get(num) + 1);
            } else {
                answer.put(num, 1);
            }
        }

        return answer;























    }
}
