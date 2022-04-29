import Humanoid.Human;


import java.util.Scanner;

public class GameController {

    private Land land;
    private Human player;
    private BattleHandler battleHandler;
    private Scanner scanner;

    public GameController() {

        startGame();
    }

    public void startGame() {

        scanner = new Scanner(System.in);
        displayTitleScreen();
        player = new Human(scanner.next());
        showInstructions();
        land = new Land();
        battleHandler = new BattleHandler(scanner);
        player.setX(land.getHumanLocation().get("x"));
        player.setY(land.getHumanLocation().get("y"));
        gameLoop();

    }

    public void displayTitleScreen() {
        System.out.println("----------------------------");
        System.out.println("Welcome to Human vs Goblins");
        System.out.println("----------------------------");
        System.out.println("What is your name human?");
    }

    public void showInstructions() {
        System.out.println("Welcome " + player.getName());
        System.out.println("The rules of the game are as follows");
        System.out.println("Goblins have invaded your world");
        System.out.println("To save the planet, you must defeat them all!");
        System.out.println("You will move around the terrain using n/e/s/w");
        System.out.println("Once you find them, kill them...if you can.");

    }

    private void gameLoop() {
        String userInput = "";
        while (true) {
            while (!userInput.matches("[nNsSeEwWqQ]")) {
                promptForDirection();
                try {
                    userInput = scanner.nextLine().toLowerCase();
                } catch (Exception e) {
                    userInput = "q";
                    System.out.println("Invalid input.  Game will now exit.");
                    System.exit(0);
                }
            }

            if (userInput.equals("q"))
                break;

            char interactionEncountered = movePlayer(userInput);

            switch (interactionEncountered) {
                case 'G': {
                    land.printGrid();
                    System.out.println("\nYou have encountered a goblin!");
                    System.out.println("Let the battle commence!\n");

                    int[] coordinates = battleHandler.commenceBattle(player);

                }

                    if (!land.printGrid()) {

                        System.out.println("\nCongratulations, " + player.getName() + ", you have beaten the game by defeating all goblins!");
                        System.exit(0);
                    }

                    userInput = ""; // resets user input to restart the loop.

                case 'N' : {
                    land.printGrid();
                    userInput = ""; // resets user input to restart the loop.
                }
            }
        }
    }

    private char movePlayer(String direction) {

        int x = player.getX();
        int y = player.getY();
        char collision = 'N'; // defaults to 'N' which stands for NOTHING. Returns P for potion, G for goblin,
        // or T for treasure.

        switch (direction) {
            case "n" : { // moves player north on map.
                if (x-1 >= 0) {
                    collision = land.updateHumanLocation(x, y, x-1, y);
                    player.setX(land.getHumanLocation().get("x"));
                    player.setY(land.getHumanLocation().get("y"));
                }
            }
            case "s" : { // moves player south on map.
                if (x+1 < 6) {
                    collision = land.updateHumanLocation(x, y, x+1, y);
                    player.setX(land.getHumanLocation().get("x"));
                    player.setY(land.getHumanLocation().get("y"));
                }
            }
            case "e" : { // moves player east on map.
                if (y+1 < 6) {
                    collision = land.updateHumanLocation(x, y, x, y+1);
                    player.setX(land.getHumanLocation().get("x"));
                    player.setY(land.getHumanLocation().get("y"));
                }
            }
            case "w" : { // moves player west on map.
                if (y-1 >= 0) {
                    collision = land.updateHumanLocation(x, y, x, y-1);
                    player.setX(land.getHumanLocation().get("x"));
                    player.setY(land.getHumanLocation().get("y"));
                }
            }
        }
        return collision;
    }

    private void promptForDirection() {
        System.out.println("\nWhich direction would you like to go, " + player.getName() + "?");
        System.out.println("(N, S, E, W, or Q to quit)\n");
    }
}
