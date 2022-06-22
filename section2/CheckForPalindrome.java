package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class CheckForPalindrome implements Assignment {
    public boolean solution(String pally) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (pally.length() == 0) {
            return true;
        }
        if (pally.length() == 1) {
            return true;
        }

        String reverse = "";
        int i;

        for (i = pally.length() - 1; i >= 0; i--) {
            reverse = reverse + pally.charAt(i);
        }

        if (reverse.equals(pally)) {
            return true;
        } else {
            return false;
        }

    }
}
