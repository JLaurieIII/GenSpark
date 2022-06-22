package genspark.assignments.section5;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import genspark.assignments.Assignment;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class AnagramWithSets implements Assignment {
    public boolean solution(String word1, String word2) {
        // ↓↓↓↓ your code goes here ↓↓↓↓



        if (word1.length() != word2.length()) {
            return false;
        }
        if (word1.length() == 0 || word1.length() == 1) {
            return false;
        }
        if (word1.equals(word2)) {
            return false;
        }

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < word1.length(); i++) {
            set1.add(word1.charAt(i));
            set2.add(word2.charAt(i));
        }

        if (Objects.equals(set1, set2)) {
            return true;
        } else {
            return false;
        }
















    }
}
