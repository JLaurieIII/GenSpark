package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class OutgoingCallsFromBangalore implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        // Not returning the correct answer, no feedback
        // Next is to debug and look at values

        File texts = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv");
        File calls = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv");

        HashSet<String> set = new HashSet<>();

        Scanner textScanner = new Scanner(texts);
        String lastRowCall = null;
        while(textScanner.hasNext()){
            lastRowCall = textScanner.nextLine();
            String[] splittedString = lastRowCall.split(",");
            set.add(splittedString[0]);
            set.add(splittedString[1]);
        }

        Scanner callScanner = new Scanner(calls);
        String row = null;
        while(callScanner.hasNext()){
            row = callScanner.nextLine();
            String[] splittedString = row.split(",");
            set.add(splittedString[0]);
            set.add(splittedString[1]);
        }

        List<String> list = new ArrayList<>();

        Set<String> numbersNotSorted = new HashSet<>();



        for(String number: set){
            if(number.contains("(")){
              //(044)41581342
                int index = number.indexOf(")");
                String code = number.substring(1,index);
                numbersNotSorted.add(code);
                continue;
            }
            if(number.charAt(0) == '7' || number.charAt(0) == '8' || number.charAt(0) == '9'){
                //(044)41581342
                String code = number.substring(0,4);
                numbersNotSorted.add(code);

            }
        }
        numbersNotSorted.add("140");
        ArrayList<String> list1 = new ArrayList<>(numbersNotSorted);
        list1.sort(String::compareTo);

        return String.join("", list1);

    }

}
