package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class IterateThroughArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<String> myList) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        ArrayList<Integer> countArray = new ArrayList<Integer>();
        /*
        for (int i = 0; i < myList.size(); i++) {
            int count = myList.get(i).length();
            countArray.add(count);
        }

        return countArray;

         */


        for (int i = 0; i < myList.size(); i++) {
            int count = myList.get(i).length();
            countArray.add(count);
        }
        return countArray;
    }
}
