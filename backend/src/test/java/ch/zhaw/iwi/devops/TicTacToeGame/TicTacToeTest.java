package ch.zhaw.iwi.devops.TicTacToeGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    
    private TicTacToeGame game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToeGame();
    }

    @Test
    public void Test1() {
        game.play(0, 0);
        Assertions.assertEquals('X', game.getFieldValue(0, 0));
    }

    @Test
    public void Test2() {
        game.play(0, 0);
        Assertions.assertEquals('X', game.getFieldValue(0, 0));
    }

    @Test
    public void Test3() {
        game.play(1, 1);
        game.play(1, 1);
        Assertions.assertEquals('X', game.getFieldValue(1, 1));
    }
    
}   