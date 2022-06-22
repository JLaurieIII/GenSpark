package genspark.assignments.section5;

import genspark.assignments.Assignment;
import org.hotswap.agent.javassist.bytecode.annotation.IntegerMemberValue;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListAscending implements Assignment {
    public ArrayList<Integer> solution(ArrayList<Integer> list) {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        // Bubble sort
        /*
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size() ; j++){

                int tmp = 0;
                if (list.get(i) > list.get(j)) {
                    tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
        return list;

         */



        ArrayList<Integer> answer =  new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;



    }
}
