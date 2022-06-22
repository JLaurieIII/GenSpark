package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class LongestCall implements Assignment {
    public String solution() throws IOException {
        //gets and stores each call in a 2d arrayList
        ArrayList<String[]> callList = new ArrayList<>();
        String callFileStr = "";
        try {
            File callFile = new File("src/main/resources/calls.csv");
            Scanner reader = new Scanner(callFile);
            while (reader.hasNextLine()) {
                callFileStr = reader.nextLine();
                String[] textLine = callFileStr.split(",");
                callList.add(textLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //takes each unique number from callList and adds them to hashset-> hashset only allows unique values/elements
        Set<String> uniqueNums = new HashSet<>();
        for(String[] n: callList){
            uniqueNums.add(n[0]);
            uniqueNums.add(n[1]);
        }

        //stores number as a key(string) and call curation as values(int)
        HashMap<String, Integer> callLogDurationMap = new HashMap<>();

        //iterates over unique numbers
        for(String u: uniqueNums){
            //for each unique number go over each call in call list
            for(String[] c: callList){
                //if call c[0](receiving #) in call list is == to unique call, add up duration and set to hashmap
                if(u.equals(c[0])){
                    //checks if hashmap contains key from # at index[0] already then adds duration
                    if(!callLogDurationMap.containsKey(c[0])){
                        callLogDurationMap.put(c[0], Integer.valueOf(c[3]));
                    }else {
                        int currentDur = callLogDurationMap.get(u);
                        callLogDurationMap.put(c[0], Integer.valueOf(c[3]) + currentDur);
                    }
                }
                //if call c[1](incoming #) in call list is == to unique call, add up duration and set to hashmap
                if(u.equals(c[1])){
                    //checks if hashmap contains key from # at index[1] already then adds duration
                    if(!callLogDurationMap.containsKey(c[1])){
                        callLogDurationMap.put(c[1], Integer.valueOf(c[3]));
                    }else {
                        int currentDur = callLogDurationMap.get(u);
                        callLogDurationMap.put(c[1], Integer.valueOf(c[3]) + currentDur);
                    }
                }
            }
        }

        //gets largest value from hashmap and stores it
        int maxValueOfMap = (Collections.max(callLogDurationMap.values()));

        //loops over hashmap looking for maxValueOfMap, then returning it's key value as a string
        for(Map.Entry<String, Integer> entry: callLogDurationMap.entrySet()){
            if(entry.getValue()==maxValueOfMap){
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }


        return null;
    }
}
