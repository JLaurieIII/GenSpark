package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class OrganizeTheStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        /*
        ArrayList<Integer> middleMan = new ArrayList<>();

        if (stack.empty()) {
            return stack;
        }

        int sizeStack = stack.size();
        for (int i = 0; i < sizeStack; i++) {
            middleMan.add(stack.pop());
        }

        Collections.sort(middleMan);

        int size = middleMan.size() - 1;
        for (int j = size; j >= 0; j--) {
            stack.push(middleMan.get(j));
        }
        return stack;

         */

        Stack<Integer> answer = new Stack<>();
        ArrayList<Integer> middle = new ArrayList<>();

        for (int num: stack) {
            middle.add(num);
        }

        Collections.sort(middle);

        int middleFinalIndex = middle.size() - 1;

        for (int i = middleFinalIndex; i >= 0; i--) {
            answer.push(middle.get(i));
        }
        return answer;























    }
}
