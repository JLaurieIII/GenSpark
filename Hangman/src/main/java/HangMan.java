import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class HangMan {

    private String randomTeamWord;
    private String guessedTeamWord;
    private boolean stillPlaying;
    private final String missedLetters;
    private DisplayWord displayWord;
    private final int consTries;
    private String name;

    // Helpers
    public void initNewGame() {
        WordGenerator wordGenerator = new WordGenerator();
        this.randomTeamWord = wordGenerator.generateWord();
        this.guessedTeamWord = genBlankLines(this.randomTeamWord);
        displayWord = new DisplayWord(randomTeamWord, guessedTeamWord);
        this.stillPlaying = true;
    }

    // Getters
    public String getRandomTeamWord() {return randomTeamWord;}
    public String getGuessedTeamWord() {return guessedTeamWord;}

    public HangMan(int tries) {
        this.missedLetters = "";
        this.consTries = tries;
        this.stillPlaying = true;
    }

    public void startGame() throws Exception {
        System.out.println();
        System.out.println("Welcome to HangMan Sports Edition.");
        System.out.println("You have six guesses to find the NFL, NBA, MLB, or NHL team.");
        System.out.println();
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();

        System.out.println("HANGMAN \nMissed letters: " + missedLetters + "\n" + guessedTeamWord);
        initNewGame();
        runGame(name);

        System.out.println("Do you want to play again? (yes or no)");
        try{
            Scanner myObj = new Scanner(System.in);
            String replay = myObj.nextLine();
            if(replay.equals("yes") || replay.equals("y")){
                startGame();
            }else{
                System.out.println("Game will now terminate.");
            }
        }catch (Exception e){
            System.out.println("idk");
            throw new Exception(e.getMessage(), e.getCause());
        }
    }

    public void runGame(String name) throws IOException {
        while (stillPlaying) {
            try {
                System.out.println("Please enter a letter");
                Scanner scanner = new Scanner(System.in);
                String guessedLetter = scanner.nextLine();
                System.out.println(displayWord.makeGuess(guessedLetter));
            } catch (Exception e) {
               e.printStackTrace();
            }

            if (displayWord.getGuessedTeamWord().equals(randomTeamWord)) {
                System.out.print("Congratulations, you guessed the secret team in " + displayWord.getTries() + " tries.\n");
                stillPlaying = false;
                saveHighScoresWithName(name, displayWord.getTries());
                break;
            }

            if (displayWord.getTries() == consTries) {
                System.out.print("Sorry, " + this.name + ", the secret team was " + randomTeamWord);
                stillPlaying = false;
                break;
            }

        }
    }

    // Generates correct amount of blank lines for random team
    public String genBlankLines(String team){
        return "_".repeat(team.length());
    }

    public void saveHighScoresWithName(String name, int tries) throws IOException {
        Path highScorePath = Paths.get("D:/devel/SourceRepo/Hangman/src/main/java/high_scores.txt");
        Files.writeString(highScorePath, name + " : " + tries + "\n", StandardCharsets.UTF_8);
    }
}