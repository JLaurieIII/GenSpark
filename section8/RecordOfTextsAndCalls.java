package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class RecordOfTextsAndCalls implements Assignment {
    public String[] solution() throws IOException {
        // ↓↓↓↓ your code goes here ↓↓↓↓

        // Text appears to be passing, but calls is not


        File texts = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\texts.csv");
        File calls = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\calls.csv");

        Scanner sc = new Scanner(texts);
        String firstRowText = sc.nextLine();

        Scanner callScanner = new Scanner(calls);
        String lastRowCall = null;
        while(callScanner.hasNext()){
            lastRowCall = callScanner.nextLine();
        }


        String[] textRow = firstRowText.split(",");
        String[] callRow = lastRowCall.split(",");



        String textAnswer = "First record of texts, " + textRow[0] + " texts " + textRow[1] + " at time " + textRow[2];
        String callAnswer = "Last record of calls, " + callRow[0] + " calls " + callRow[1] + " at time " + callRow[2] + ", lasting " + callRow[3] + " seconds";

        return new String[]{textAnswer, callAnswer};

    }


}
