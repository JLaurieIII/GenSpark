package genspark.assignments.section7;

import genspark.assignments.Assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap implements Assignment {
    public Object[] solution(ArrayList<ArrayList<Integer>> listolists) {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        return listolists.stream()
                        .filter(o -> o.size() % 2 != 0)
                        .map(i -> i.stream().map(n -> n * 10)
                        .collect(Collectors.toList()))
                        .toArray();

         */

        return listolists.stream()
                .filter(a -> a.size() % 2 != 0)
                .map(i -> i.stream().map(n -> n * 10))
                .collect(Collectors.toList())
                .toArray();


















    }
}
