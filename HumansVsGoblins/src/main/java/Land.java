import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Land {

    private final int ROWS = 6;
    private final int COLUMNS = 6;

    private final char[][] grid;
    private final HashMap<String, Integer> humanLocation;
    private int numGoblins = 5;

    public Land() {

        humanLocation = new HashMap<>();
        grid = new char[ROWS][COLUMNS];
        createDefaultGrid();
        generateGoblinLocations(); // Adds goblins to the starting map.
        generateHumanStartingLocation(); // Adds human to the starting map.
        printGrid();
    }
    private void createDefaultGrid() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                grid[i][j] = '~';
            }
        }
    }

    private void generateGoblinLocations() {

        for (int i = 0; i < numGoblins; i++) {
            int row = (int) (Math.random() * ROWS);
            int column = (int) (Math.random() * COLUMNS);
            if (grid[row][column] == 'G')
                i--;
            else {
                grid[row][column] = 'G';
            }
        }
    }

    private void generateHumanStartingLocation() {

        for (int i = 0; i < 1; i++) {
            int row = (int) (Math.random() * ROWS);
            int column = (int) (Math.random() * COLUMNS);

            if (grid[row][column] != 'G') {
                grid[row][column] = 'H';
                humanLocation.put("x", row);
                humanLocation.put("y", column);
            } else {
                i--;
            }
        }
    }

    public boolean printGrid() {
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (j == COLUMNS - 1) {
                    System.out.println(grid[i][j]);
                } else
                    System.out.print(grid[i][j] + "  ");
            }
        }

        return goblinsStillAlive();
    }

    public char updateHumanLocation(int startX, int startY, int endX, int endY) {

        char interactionEncountered = 'N'; // Default is N, which stands for Nothing.

        if (grid[endX][endY] == 'G')
            interactionEncountered = grid[endX][endY];

        grid[endX][endY] = 'H';
        grid[startX][startY] = '~';
        humanLocation.replace("x", startX, endX);
        humanLocation.replace("y", startY, endY);

        return interactionEncountered;
    }

    public boolean goblinsStillAlive() {

        boolean goblinsAlive = false;

        outer:
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (grid[i][j] == 'G') {
                    goblinsAlive = true;
                    break outer;
                }
            }
        }

        return goblinsAlive;
    }

    public HashMap<String, Integer> getHumanLocation() {
        return humanLocation;
    }

}
