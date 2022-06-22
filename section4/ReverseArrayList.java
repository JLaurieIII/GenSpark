package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class ReverseArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int len = list.size() - 1;
        int count = 0;


        for (int elem: list) {
            newList.add(count, list.get(len));
            count++;
            len--;
        }


        return newList;

         */

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            answer.add(list.get(i));
        }

        return answer;
    }
}
