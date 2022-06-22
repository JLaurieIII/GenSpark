package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArray implements Assignment {
    public int[] solution(int[] nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        /*
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int[] answer = new int[set.size()];
        int a = 0;
        for (Integer val: set) {
            answer[a++] = val;
        }

        return answer;

         */

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            set.add(nums[i]);
        }

        int setSize = set.size();
        int[] answer = new int[setSize];
        int a = 0;
        for (int val: set) {

            answer[a++] = val;

        }

        return answer;


    }
}





        /* Don't understand why this don't work either


        Arrays.sort(nums);
        int n = nums.length;

        if (n == 0 || n == 1) {
            return nums;
        }

        int j = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }
        return temp;

         */



        /* I still don't understand how this doesn't work


        ArrayList<Integer> middleMan = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            middleMan.add(i);
        }

        for (int i = 1; i < middleMan.size(); i++) {
            if (middleMan.get(i) == middleMan.get(i - 1)) {
                middleMan.remove(i - 1);
            }
        }

        int[] answer = middleMan.toArray(new int[middleMan.size()]);

        return answer;

         */


