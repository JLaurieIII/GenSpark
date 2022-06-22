package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingNums implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (!nums.contains(i)) {
                answer.add(i);
            }
        }

        return answer;





    }

}
