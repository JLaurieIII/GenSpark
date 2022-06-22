package genspark.assignments.section2;

import genspark.assignments.Assignment;

public class TypeConversion implements Assignment {
    public Object solution(Object object) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        if (object instanceof String) {
            int stringToInt = Integer.parseInt((String)object);
            return stringToInt;
        }
        if (object instanceof Integer) {
            String intToString = String.valueOf((Integer)object);
            return intToString;
        }
        if (object instanceof Character) {
            String charToString = String.valueOf((Character)object);
            return charToString;
        }
        return null;
    }
}
