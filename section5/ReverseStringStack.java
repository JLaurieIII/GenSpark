package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.Stack;

public class ReverseStringStack implements Assignment {
    public String solution(String word) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        /*
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        while (!stack.empty()) {
            reverse = reverse + stack.pop();
        }


        return reverse;

         */

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reverse = "";

        int stackSize = stack.size();

        for (int i = 0; i < stackSize; i++) {
            reverse += stack.pop();
        }

        return reverse;
















    }
}
