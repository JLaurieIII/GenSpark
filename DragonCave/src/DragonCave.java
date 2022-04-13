import java.util.Scanner;

public class DragonCave {

    private int userInput;

    public DragonCave() {

        userInput = 0;
    }

    public void runGame() {
        Scanner scanner = new Scanner(System.in);
        introAndPromptUser();
        userInput = getUserInput(scanner);
        displayResults();
    }

    // Method for Printing Introduction and Prompting for Input
    private void introAndPromptUser() {
        print("You are in a aland full of dragons. In front of you,");
        print("you see two caves. In one cave, the dragon is friendly");
        print("and will share his treasure with you. The other dragon");
        print("is greedy and hungry and will eat you on sight.");
        print("Which cave will you go into? (1 or 2)");
    }

    // Method to simplify print statements
    private void print(String str) {
        System.out.println(str);
    }

    private int getUserInput(Scanner scanner) {
        do {
            int choice = 0;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                print("That's not a number!");
                scanner.nextLine();
            }

            if (choice == 1) {
                userInput = choice;
                break;
            } else if (userInput == 2) {
                userInput = choice;
                break;
            } else {
                print("Please enter the number 1 or 2.");
            }
        } while (userInput != 1 || userInput != 2);

        return userInput;
    }

    private void displayResults() {
        if (userInput == 1) {
            print("You approach the first cave...");
            print("It is dark and spooky...");
            print("A large dragon jumps out in front of you! He opens his jaws and...");
            print("Gobbles you down in one bite!");
        } else if (userInput == 2) {
            print("You approach the second cave...");
            print("It is dark but you see a light flickering in the distance...");
            print("A large dragon jumps out in front of you! He smiles and...");
            print("Leads you to the treasure chest!");
        }
    }
}
