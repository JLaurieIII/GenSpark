package genspark.assignments.section8;

import genspark.assignments.Assignment;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CreateAFile<textFilePath> implements Assignment {

    // No reaction from GUI

    private Path filePath;

    public void createAFile()  {

        String TEXT_FILE = "sample_data.txt";

         filePath = Paths.get(TEXT_FILE);
        try {
            Path createdFilePath = Files.createFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToAFile() {
        try {
            Files.writeString(filePath, "test");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Character> readAFile() {
        ArrayList<Character> answer = new ArrayList<>();
        try {
            String readString = Files.readString(filePath);
            for(Character c: readString.toCharArray()){
                answer.add(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;
    }


}
