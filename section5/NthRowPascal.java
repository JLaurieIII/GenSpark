package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class NthRowPascal implements Assignment {
    public ArrayList<Integer> solution(int nth) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);

        if (nth == 0) {
            return answer;
        }

        ArrayList<Integer> prev = solution(nth - 1);

        for (int i = 1; i < prev.size(); i++) {
            int curr = prev.get(i - 1) + prev.get(i);
            answer.add(curr);
        }
        answer.add(1);

        return answer;

         */

        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(1);

        if (nth == 0) return answer;

        ArrayList<Integer> prev = solution(nth - 1);

        for (int i = 1; i < prev.size(); i++) {
            int curr = prev.get(i - 1) + prev.get(i);
            answer.add(curr);
        }

        answer.add(1);

        return answer;


















    }
}
