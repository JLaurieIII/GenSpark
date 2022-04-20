import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayWord {

    private String randomTeam;
    private String guessedTeam;
    private String blanks;
    private String missedLetters;
    private int tries;

    // Generates correct amount of blank lines for random team
    public String genBlankLines(String team){
        String blanks = "";
        for(int i = 0; i< team.length(); i++){
            blanks +="_";
        }
        return blanks;
    }


    // Updates the blank lines with correctly guessed letters
    public void updateTeam(String letter) {

        if (!guessedTeam.contains(letter) && randomTeam.contains(letter)) {
            Pattern pt = Pattern.compile(letter);
            Matcher mt = pt.matcher(randomTeam);

            while (mt.find()) {
                guessedTeam = guessedTeam.substring(0, mt.start()) + letter + guessedTeam.substring(mt.start()+1);
            }
        }
    }


    // Returns a response based off of the guess made by player
    public String makeGuess(String letter) {

        if (!guessedTeam.contains(letter) && randomTeam.contains(letter)) {
            updateTeam(letter);
        } else if (guessedTeam.contains(letter) && randomTeam.contains(letter)) {
            return "You already guessed that letter genius.";
        } else if (!guessedTeam.contains(letter) && randomTeam.contains(letter)) {
            tries++;
            missedLetters += letter;
        }
        return "Missed letters: " + missedLetters + "\n" + guessedTeam;
    }
}


