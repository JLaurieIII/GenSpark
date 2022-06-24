public class GameController {

    private Grid grid;
    private Human human;
    private Goblin goblin;

    public GameController() {
        this.grid = new Grid();
    }

    public void initializeGame() {

        System.out.println();
    }

    public void moveHuman(char direction) {

        switch (direction) {
            case 'n':
                break;
            case 's':
                break;
            case 'e':
                break;
            case 'w':
                break;
        }

    }
}
