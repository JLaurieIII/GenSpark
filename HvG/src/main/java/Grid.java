import java.util.ArrayList;
import java.util.List;

public class Grid {

    private int ROWS = 11;
    private final int COLUMNS = 11;
    private char[][] grid;
    private int numGoblins = 10;

    public Grid() {
        grid = new char[ROWS][COLUMNS];
        createDefaultGrid();
        generateGoblins();
        generateHuman();
        printGrid();
    }

    private void createDefaultGrid() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                grid[i][j] = '~';
            }
        }
    }

    private void generateGoblins() {

        for (int i = 0; i < numGoblins; i++) {
            int row = (int) (Math.random() * ROWS);
            int col = (int) (Math.random() * COLUMNS);

            if (grid[row][col] == 'G') {
                i--;
            } else {
                grid[row][col] = 'G';
            }
        }
    }

    private void generateHuman() {

        for (int i = 0; i < 1; i++) {
            int row = (int) (Math.random() * ROWS);
            int col = (int) (Math.random() * COLUMNS);

            if (grid[row][col] == 'G') {
                i--;
            } else {
                grid[row][col] = 'H';
            }
        }
    }

    public void printGrid() {
        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (j == COLUMNS - 1) {
                    System.out.println(grid[i][j]);
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
    }
}
