import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    static boolean isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (!s.isEmpty() && s.charAt(i) == '(' && stack.peek() == '(') {

            } else {
                stack.pop();
            }

        }


    }

}

