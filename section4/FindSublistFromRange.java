package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindSublistFromRange implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> elms, int from, int to) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<Integer> desiredArray = new ArrayList<Integer>();

        if (elms.size() == 0) {
            return desiredArray;
        } else {
            for (int elem: elms) {
                while (to > from) {

                    desiredArray.add(elms.get(from));
                    from++;
                }
            }
        }
        return desiredArray;

         */

        ArrayList<Integer> answer = new ArrayList<>();

        if (elms.size() == 0) return answer;

        while (to > from) {
            answer.add(elms.get(from));
            from++;
        }

        return answer;
    }
}
