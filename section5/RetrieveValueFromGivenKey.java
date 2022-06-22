package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.HashMap;

public class RetrieveValueFromGivenKey implements Assignment {
    public int solution(HashMap<Integer,Integer> map, Integer value) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        if (!map.containsKey(value)) {
            return 0;
        } else {
            return map.get(value);
        }
    }
}
