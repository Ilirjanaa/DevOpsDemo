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
    
    @Test
    public void Test4() {
        game.play(0, 0); // X
        game.play(0, 1); // O
        game.play(0, 2); // X
        game.play(1, 0); // O
        game.play(1, 1); // X
        game.play(1, 2); // O
        game.play(2, 0); // X
        game.play(2, 1); // O
        game.play(2, 2); // X
        Assertions.assertTrue(game.isGameOver());
    }

    @Test
    public void Test5() {
        game.play(0, 0); // X
        game.play(1, 0); // O
        game.play(0, 1); // X
        game.play(1, 1); // O
        game.play(0, 2); // X
        game.play(1, 2); // O (Hinzugefügt)
        Assertions.assertTrue(game.isGameOver());
    }

    @Test
    public void Test6() {
        game.play(0, 0); // X
        game.play(0, 1); // O
        game.play(1, 0); // X
        game.play(1, 1); // O
        game.play(2, 0); // X
        game.play(2, 1); // O

        boolean isGameOver = game.isGameOver();
        Assertions.assertTrue(isGameOver, "The game should be over when a column is taken by a player.");
    }

    @Test
    public void Test7() {
        game.play(0, 0); // X
        game.play(0, 1); // O
        game.play(1, 0); // X
        game.play(1, 1); // O
        game.play(2, 0); // X
        Assertions.assertFalse(game.isGameOver());
    }

    @Test
    public void Test8() {
        game.play(1, 0); // O
        game.play(0, 1); // X
        game.play(1, 1); // O
        game.play(0, 2); // X
        Assertions.assertTrue(game.isGameOver());
    }


}   