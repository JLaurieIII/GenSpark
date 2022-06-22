package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMaxMinArray implements Assignment {
    public ArrayList<Long> solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<Long> answer = new ArrayList<Long>();
        if (nums.length == 0) {
            answer.add(0L);
            answer.add(0L);
            return answer;


        } else if(nums.length == 1) {
            long firstElem = Long.valueOf(nums[0]);
            answer.add(firstElem);
            answer.add(firstElem);
            return answer;

        } else {
            long largest = nums[0];
            long smallest = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > largest) {
                    largest = nums[i];
                }
                if (nums[i] < smallest) {
                    smallest = nums[i];
                }
            }
            answer.add(largest);
            answer.add(smallest);
        }
        return answer;

         */

        ArrayList<Long> answer = new ArrayList<>();

        if (nums.length == 0) {
            answer.add(0L);
            answer.add(0L);
            return answer;
        }

        else if (nums.length == 1) {
            long firstElement = Long.valueOf(nums[0]);
            answer.add(firstElement);
            answer.add(firstElement);
            return answer;
        }
        else{
            long max = nums[0];
            long min = nums[0];

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] > max) {
                    max = nums[i];
                }
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            answer.add(max);
            answer.add(min);

            return answer;
        }




    }
}
