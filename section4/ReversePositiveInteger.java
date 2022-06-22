package genspark.assignments.section4;

import genspark.assignments.Assignment;

import java.util.ArrayList;

public class ReversePositiveInteger implements Assignment {
    public int solution(int number) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        String stringInt = String.valueOf(number);
        int len = stringInt.length() - 1;
        String newNumber = "";


        for (int i = len; i >= 0; i--) {
            newNumber = newNumber + stringInt.charAt(i);
        }

        return Integer.parseInt(newNumber);

         */


        String intToString = String.valueOf(number);
        String reversed = "";
        int length = intToString.length();

        for (int i = length - 1; i >= 0; i--) {
            reversed+= intToString.charAt(i);
        }

        int answer = Integer.parseInt(reversed);

        return answer;
    }
}
