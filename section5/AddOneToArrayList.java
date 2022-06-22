package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AddOneToArrayList implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        String list2str = "";
        for(Integer num: list){
            list2str += num;
        }

        int str2Num = Integer.parseInt(list2str);
        int plus1 = str2Num + 1;

        String num2String = Integer.toString(plus1);
        String[] stringArr = num2String.split("");


        ArrayList<Integer> resultsList = new ArrayList<Integer>();

        for(int i = 0; i < stringArr.length; i++){
            resultsList.add(Integer.parseInt(stringArr[i]));
        }


        return  resultsList;

         */

        ArrayList<Integer> answer = new ArrayList<>();
        String listToString = "";

        for(int num: list) {
            listToString += num;
        }

        int stringToNum = Integer.parseInt(listToString);
        int plusOne = stringToNum + 1;

        String numToString = String.valueOf(plusOne);
        String[] stringArray = numToString.split("");

        for (int i = 0; i < stringArray.length; i++) {
            answer.add(Integer.parseInt(stringArray[i]));
        }

        return answer;



















    }
}
