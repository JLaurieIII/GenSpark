package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class DeleteMiddleOfStack implements Assignment {
    public Stack<Integer> solution(Stack<Integer> stack) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        Stack<Integer> answer = new Stack<>();
        ArrayList<Integer> middleMan = new ArrayList<>();

        if (stack.size() == 0 || stack.size() == 1) {
            return answer;
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            middleMan.add(stack.pop());
        }
        int middleIntIndex = middleMan.size() / 2;

        middleMan.remove(middleIntIndex);

        int middleManFinalIndex = middleMan.size() - 1;

        for (int i = middleManFinalIndex; i >= 0; i--) {
            answer.push(middleMan.get(i));
        }

        return answer;

         */


        ArrayList<Integer> middle = new ArrayList<>();
        int stackSize = stack.size();

        if (stack.empty()) return stack;


        for (int i = 0; i < stackSize; i++) {
            middle.add(stack.pop());
        }

        int middleIntIndex = middle.size() / 2;

        middle.remove(middleIntIndex);

        int middleFinalIndex = middle.size() - 1;

        for (int i = middleFinalIndex; i >= 0; i--) {
            stack.push(middle.get(i));
        }


        return stack;
















    }
}
