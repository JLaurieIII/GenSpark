public class Humanoid {

    protected char displayChar;
    protected int health;
    protected int xCord;
    protected int yCord;

    public Humanoid() {
    }

    public Humanoid(int health, int xCord, int yCord) {
        this.health = health;
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public char getDisplayChar() {
        return displayChar;
    }

    public void setDisplayChar(char displayChar) {
        this.displayChar = displayChar;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
    }
}
