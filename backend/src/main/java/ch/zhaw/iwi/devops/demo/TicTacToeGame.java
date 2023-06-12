package ch.zhaw.iwi.devops.demo;

public class TicTacToeGame {
    
    private char[][] board;
    private char currentPlayer;
    private boolean gameOver;
    
    public TicTacToeGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameOver = false;
        initializeBoard();
    }
    
    public void initializeBoard() {
        // Initialize the board with empty spaces
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    public boolean isGameOver() {
        return gameOver;
    }
    
    public char getCurrentPlayer() {
        return currentPlayer;
    }
    
    public void makeMove(int row, int col) {
        if (gameOver || board[row][col] != ' ') {
            throw new RuntimeException("Invalid move");
        }
        
        board[row][col] = currentPlayer;
        
        if (checkWin()) {
            gameOver = true;
        } else if (checkDraw()) {
            gameOver = true;
        } else {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
    
    private boolean checkWin() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }
        
        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }
        
        return false;
    }
    
    private boolean checkDraw() {
        // Check if all fields are taken
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}