package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collections;

public class LastIndexFound implements Assignment {
    public int solution(ArrayList<Integer> nums, int numToFind) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        return nums.lastIndexOf(numToFind);

         */


        int desiredIndex = -1;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) == numToFind) {
                desiredIndex = i;
                break;
            }
        }
        return desiredIndex;



        /*
        int desiredIndex = -1;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) == numToFind) {
                desiredIndex = i;
                break;
            }
        }

        return desiredIndex;

         */





    }
}
