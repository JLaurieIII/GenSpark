package genspark.assignments.section5;

import genspark.assignments.Assignment;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class ParenthesisBalance implements Assignment {
    public String solution(String s) {

        /*
        String answer = "";


        int size = s.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.empty() && (s.charAt(i) == ')' && stack.peek() == '(')) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            answer = "balanced";
        } else {
            answer = "unbalanced";
        }
        if (s.length() == 0) {
            answer = "unbalanced";
        }
        return answer;

         */

        String check = "";
        String answer = null;

        Stack<Character> stack = new Stack<>();

        int stringSize = s.length();

        if (stringSize % 2 != 0) answer = "unbalanced";

        for (int i = 0; i < stringSize; i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!stack.empty() && s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            answer = "balanced";
        } else {
            answer = "unbalanced";
        }

        if (s.length() == 0) answer = "unbalanced";

        return answer;


    }
}
