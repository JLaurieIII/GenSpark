import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WordGenerator {

    private ArrayList<String> teams;
    private final Random random = new Random();
    public WordGenerator() {
        teams = new ArrayList<>();
        Scanner textScanner = null;
        try {
            File dictionary = new File("D:/devel/SourceRepo/Hangman/src/main/java/teams");
            textScanner = new Scanner(dictionary);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        while (textScanner.hasNextLine()) {
            teams.add(textScanner.nextLine());
        }
    }

    public WordGenerator(ArrayList<String> teams) {
        this.teams = teams;
    }

    public String generateWord() {
        int randomNumber = random.nextInt(teams.size());
        String randomWord = teams.get(randomNumber);
        return randomWord.toLowerCase();
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

    public void addTeam(String team) {
        teams.add(team);
    }

    public void addWords(ArrayList<String> teams) {
        this.teams.addAll(teams);
    }

    public ArrayList<String> getTeams() {
        return teams;
    }
}
