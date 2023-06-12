package ch.zhaw.iwi.devops.demo;
import org.junit.jupiter.api.BeforeEach;

public class TicTacToeGameTest {
    private TicTacToeGame game;
    
    @BeforeEach
    public void setUp() {
        game = new TicTacToeGame();
    }
    
    @Test
    public void testGameIsOverWhenAllFieldsInRowAreTaken() {
        // Test implementation
    }
    
}
