import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;

class DragonCaveTest {

    DragonCave dragonCave;

    @BeforeEach
    void setUp() {
        dragonCave = new DragonCave();
    }

    @Test
    void getUserInput() {
        dragonCave.setUserInput(1);
        assertEquals(1, dragonCave.getUserInput(), "This test should return 1.");
    }


    @AfterEach
    void tearDown() {
        System.out.println("Test Completed...");
    }
}