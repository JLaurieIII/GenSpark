import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DrawHangman {

    private String hangmanDrawings;
    private String[] drawingsArray;

    public DrawHangman() {
        loadHangmanFile();
    }

    private void loadHangmanFile() {

        Path path = Path.of("src", "main", "resources", "hangman.txt");
        try {
            hangmanDrawings = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        drawingsArray = hangmanDrawings.split(",");
    }

    public void drawHangmanPicture(int tries) {
        System.out.println(drawingsArray[tries]);
    }

}
