package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PotentialTelemarketers implements Assignment {
    public String solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓


        // In this one I need a way to compare the two sets
        // If the number is in one set and not the other, I need to return those numbers
        // And then sort in lexicographic order

        File callRecords = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv");
        File textRecords = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv");

        Scanner callScanner = new Scanner(callRecords);
        Scanner textScanner = new Scanner(textRecords);

        HashSet<String> outgoingCallSet = new HashSet<>();
        HashSet<String> incomingCallAndAllTexts = new HashSet<>();
        ArrayList<String> naughtyList = new ArrayList<>();

        while(callScanner.hasNext()){

            String callRow = callScanner.nextLine();
            String[] splitRows = callRow.split(",");
            outgoingCallSet.add(splitRows[0]);
            incomingCallAndAllTexts.add(splitRows[1]);
        }

        while(textScanner.hasNext()){

            String textRow = textScanner.nextLine();
            String[] splitRows = textRow.split(",");
            incomingCallAndAllTexts.add(splitRows[0]);
            incomingCallAndAllTexts.add(splitRows[1]);
        }

        for(String number: outgoingCallSet){
            if(!incomingCallAndAllTexts.contains(number)){
                naughtyList.add(number);
            }
        }

        naughtyList.sort(String::compareTo);

       return String.join(" ", naughtyList);
    }
}
