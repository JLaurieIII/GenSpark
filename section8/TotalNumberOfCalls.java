package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class TotalNumberOfCalls implements Assignment {
    public int solution() throws IOException {

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

        return set.size();
    }
}

