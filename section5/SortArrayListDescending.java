package genspark.assignments.section5;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class SortArrayListDescending implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        if(list.size() == 0) {
            return list;
        }

        // Bubble Sort
        int index = list.size() - 1;

        for (int i = index; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int temp;
                if (list.get(i) > list.get(j)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }
            }
        }
        return list;

         */

        int finalIndex = list.size() -1;

        for (int i = finalIndex; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {

                int temp;

                if (list.get(i) > list.get(j)) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, temp);
                }

            }
        }
        return list;

    }
}
