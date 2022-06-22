package genspark.assignments.section7;

import genspark.assignments.Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QueryTheFile implements Assignment {
    public ArrayList<String> solution() throws IOException{
        // ↓↓↓↓ your code goes here ↓↓↓↓

        /*
        ArrayList<String> lines = new ArrayList<>();

        File filterFile = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\filter_problem.text");
        Scanner filterScanner = new Scanner(filterFile);
        ArrayList<String> list = new ArrayList<>();

        while(filterScanner.hasNext()) {
            String row = filterScanner.nextLine();
            list.add(row);
        }


        return (ArrayList<String>) list.stream().filter(line -> !line.contains("2")).collect(Collectors.toList());
        */


       File file = new File("C:\\GenSpark\\genspark-java-core\\genspark-java-core\\genspark-java-core\\src\\main\\resources\\filter_problem.text");
       Scanner fileScanner = new Scanner(file);

       ArrayList<String> middleMan = new ArrayList<>();
       while(fileScanner.hasNext()) {
           String row = fileScanner.nextLine();
           middleMan.add(row);
       }

       return (ArrayList<String>) middleMan.stream().filter(s -> !s.contains("2")).collect(Collectors.toList());















    }
}
