import java.util.Scanner;

public class HangMan {

    private String randomTeam;
    private String guessedTeam;
    private boolean stillPlaying;
    private String missedLetters;
    private WordGenerator wordGenerator;
    private DisplayWord displayWord;
    private int tries;
    private String name;


    // Helpers
    public void initNewGame() {

        wordGenerator = new WordGenerator();
        displayWord = new DisplayWord();
        this.randomTeam = wordGenerator.generateWord();
        this.guessedTeam = displayWord.genBlankLines(this.randomTeam);
        this.stillPlaying = true;
    }

    // Getters
    public String getRandomTeam() {return randomTeam;}
    public String getGuessedTeam() {return guessedTeam;}

    public HangMan(String guessedTeam, String randomTeam, int tries) {

        this.randomTeam = randomTeam;
        this.guessedTeam = guessedTeam;
        this.missedLetters = "";
        this.stillPlaying = true;
    }

    public void runGame() {

        while (stillPlaying) {
            try {
                Scanner scanner = new Scanner(System.in);
                String guessedLetter = scanner.nextLine();
                System.out.println(displayWord.makeGuess(guessedLetter));
            } catch (Exception e) {
                System.out.println("Please enter a letter");
            }
            if (tries == 6) {
                System.out.print("Sorry, " + name + ", the secret team was " + randomTeam);
                stillPlaying = false;
                break;
            }
            if (guessedTeam.equals(randomTeam)) {
                System.out.print("Congratulations, you guessed the secret team in " + tries + " tries.");
                stillPlaying = false;
                break;
            }
        }
    }

    public void startGame() {


        System.out.println();
        System.out.println("Welcome to HangMan Sports Edition.");
        System.out.println("You have six guesses to find the NFL, NBA, MLB, or NHL team.");
        System.out.println();
        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();


        System.out.println("HANGMAN\nMissed letters:"+ missedLetters + "\n"+ guessedTeam);
        runGame();

        System.out.println("Do you want to play again? (yes or no)");
        try{
            Scanner myObj = new Scanner(System.in);
            String replay = myObj.nextLine();
            if(replay.equals("yes") || replay.equals("y")){
                initNewGame();
                startGame();
            }else{
                System.out.println("Game will now terminate.");
            }
        }catch (Exception e){
            System.out.println("idk");
        }
    }
}