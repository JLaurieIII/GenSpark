package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TripleShotAgain implements Assignment {
    public boolean solution(boolean x, boolean y, boolean z) {
        // ↓↓↓↓ your code goes here ↓↓↓↓
        if (x == true || y == true || z == true) {
            return true;
        } else {
            return false;
        }
    }
}
