package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EvenAfterOdds implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> nums) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num: nums) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }
        for (int num: nums) {
            if (num % 2 != 0) {
                odds.add(num);
            }
        }
        for (int num: odds) {
            answer.add(num);
        }
        for (int num: evens) {
            answer.add(num);
        }

        return answer;

         */

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int num: nums) {
            if (num % 2 == 0) {
                evens.add(num);
            } else {
                odds.add(num);
            }
        }


        for (int num: odds){
            answer.add(num);
        }

        for (int num: evens){
            answer.add(num);
        }

        return answer;
















    }
}
