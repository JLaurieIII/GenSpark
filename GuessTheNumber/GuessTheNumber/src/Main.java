import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            runGame();
        }
    }
    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        int numOfGuesses = 1;

        // Get player name and give instructions for game
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");

        //Generate random number
        Random num = new Random();
        int number = 1 + num.nextInt(20);
        System.out.println(number);

        do {
            System.out.println("Take a guess.");
            int guess = scanner.nextInt();
            scanner.nextLine();

            if (guess == number) {
                if (numOfGuesses == 1) {
                    System.out.println("Good job, " + name + "! You guessed my number in " + numOfGuesses + " guess!");
                    break;
                } else {
                    System.out.println("Good job, " + name + "! You guessed my number in " + numOfGuesses + " guesses!");
                    break;
                }
            } else if (guess < 0 || guess > 20) {
                System.out.println("Please enter a number between 1-20!");
            } else if (guess > number) {
                System.out.println("Your guess is too high. Try again.");
                numOfGuesses++;
            } else if (guess < number) {
                System.out.println("Your guess is too low. Try again.");
                numOfGuesses++;
            } else {
                System.out.println("Please enter a number, not whatever that was.");
            }
        } while (numOfGuesses < 6);

        System.out.println("Do you wish to play again? Y/N");
        String playAgain = scanner.nextLine();

        if (!playAgain.equalsIgnoreCase("Y")) {
            System.out.println("Thanks for playing");
            System.exit(0);

        }
    }
}



