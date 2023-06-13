package ch.zhaw.iwi.devops.TicTacToeGame;

public class TicTacToeGame {
    
    private char[][] board;
    private char currentPlayer;

    public TicTacToeGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }

    public void play(int row, int col) {
        if (isFieldEmpty(row, col)) {
            board[row][col] = currentPlayer;
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    public boolean isGameOver() {
        return isBoardFull() || hasPlayerWon();
    }

    private void initializeBoard() {
        for (char[] row : board) {
            for (int i = 0; i < row.length; i++) {
                row[i] = ' ';
            }
        }
    }

    private boolean isFieldEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    private boolean isBoardFull() {
        for (char[] row : board) {
            for (char field : row) {
                if (field == ' '){
                      return false;
                }
            }
        }
        return true;
    }

    private boolean hasPlayerWon() {
        for (int i = 0; i < 2; i++) {
            // Überprüfe Reihen
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            
            // Überprüfe Spalten
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
    
        // Überprüfe Diagonalen
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
    
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
    
        return false;
    }

    public char getFieldValue(int row, int col) {
        if (isFieldEmpty(row, col)) {
            return ' ';
        } else {
            return board[row][col];
        }
    }
}