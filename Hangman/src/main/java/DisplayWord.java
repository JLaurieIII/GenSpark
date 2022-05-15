import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DisplayWord {

    private final String randomTeamWord;
    private String guessedTeamWord;
    private final List<String> missedLetters = new ArrayList<>();
    private int tries;
    private final DrawHangman drawHangman;

    public int getTries() {
        return tries;
    }

    public String getGuessedTeamWord() {
        return guessedTeamWord;
    }

    public DisplayWord(String randomTeam, String guessedTeam) {
        this.randomTeamWord = randomTeam;
        this.guessedTeamWord = guessedTeam;
        drawHangman = new DrawHangman();
    }

    // Returns a response based off of the guess made by player
    public String makeGuess(String letter) {
        if (!guessedTeamWord.contains(letter) && randomTeamWord.contains(letter)) {
            updateTeam(letter);
        } else if (guessedTeamWord.contains(letter) && randomTeamWord.contains(letter)) {
            return "You already guessed that letter genius.";
        } else if (!guessedTeamWord.contains(letter) && !randomTeamWord.contains(letter)) {
            drawHangman.drawHangmanPicture(tries);
            tries++;
            missedLetters.add(letter);
        }
        return "Missed letters: " +  missedLetters.stream().map(String::toLowerCase).collect(Collectors.toList()) + "\n" + guessedTeamWord + "\n";
    }


    // Updates the blank lines with correctly guessed letters
    public void updateTeam(String letter) {
        if (!guessedTeamWord.contains(letter) && randomTeamWord.contains(letter)) {
            Pattern pt = Pattern.compile(letter);
            Matcher mt = pt.matcher(randomTeamWord);

            if (mt.find()) {
                guessedTeamWord = guessedTeamWord.substring(0, mt.start()) + letter + guessedTeamWord.substring(mt.start()+1);
            }

        }
    }

}


