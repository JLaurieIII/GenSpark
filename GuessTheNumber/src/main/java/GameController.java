import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GameController {

    private String name;
    private int numOfGuesses = 0;
    private final Scanner scanner = new Scanner(System.in);
    private int userGuess;
    private int randomNum;
    private boolean stillPlaying;

    public void runGame() {

        introAndInstructions();
        gameLoop();
        playAnotherGame();
    }

    private void introAndInstructions() {

        System.out.println("Welcome to Guess the Number");
        System.out.println("You will have 5 guesses to guess the number between 1 and 20");
        System.out.println("I will tell you if your guess is too high or too low");
        System.out.println("What is you name?");

        name = scanner.nextLine();

        System.out.println("Welcome " + name + "!");
    }

    private void promptUserGuess() {

        System.out.println("Guess a number between 1-20");
        userGuess = scanner.nextInt();
        numOfGuesses++;
    }

    private int generateRandomNum() {

        Random random = new Random();
        randomNum = random.nextInt(20) + 1;
        return randomNum;
    }

    private void gameLoop() {

        stillPlaying = true;
        generateRandomNum();
        while(stillPlaying && numOfGuesses < 6){
            promptUserGuess();
            checkUserGuess(userGuess, randomNum);
        }
    }

    private void checkUserGuess(int userGuess, int randomNum) {
        if (userGuess == randomNum) {
            stillPlaying = false;
            System.out.println("Congratulations, you guessed the secret number in " + numOfGuesses + " guesses.");
        } else if (userGuess > randomNum) {
            System.out.println("Too high!");
        } else {
            System.out.println("Too low!");
        }
    }

    private void playAnotherGame() {

        System.out.println("Do you want to play again?");
        String playAgainAnswer;
        playAgainAnswer = scanner.nextLine().trim().toLowerCase();
        if (playAgainAnswer == "y") {
            gameLoop();
        } else {
            System.out.println("Thanks for playing, goodbye!");
            System.exit(0);
        }
    }
}
