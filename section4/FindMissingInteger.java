package genspark.assignments.section4;

import genspark.assignments.Assignment;
import java.util.ArrayList;

public class FindMissingInteger implements Assignment {
    public int solution(ArrayList<Integer> numbers) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        int check = 1;

        int specialNumber = 0;

        for (int elem : numbers) {
            if (elem != check) {
                specialNumber = check;
                break;
            } check++;
        }
        return specialNumber;

         */





        int check = 1;
        int missingInt = 0;

        for(int num: numbers) {
            if (num != check) {
                missingInt = check;
                break;
            }
            check++;
        }

        return missingInt;























    }
}
