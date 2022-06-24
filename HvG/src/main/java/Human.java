public class Human extends Humanoid{

    private Grid grid;
    private char displayChar = 'H';

    public Human() {
    }

    public Human(int health, int xCord, int yCord) {
        super(health, xCord, yCord);
        displayChar = 'H';
    }


    public void moveHuman() {

    }
}
