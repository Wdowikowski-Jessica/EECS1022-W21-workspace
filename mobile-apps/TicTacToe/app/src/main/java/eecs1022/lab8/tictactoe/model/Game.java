package eecs1022.lab8.tictactoe.model;

public class Game {
    private String player1;
    private String player2;
    char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
    };
    private String firstPlayer;
    private int row;
    private int column;
    private String rowsAndColumns;
    private String winner;

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.firstPlayer = player1;
    }

    public String getCurrentPlayer() {
        return this.firstPlayer;
    }

    public String getStatus() {
        String status = "";
        if (this.rowsAndColumns == "row") {
            status = "Error: row " + this.row + " is invalid.";
        } else if (this.rowsAndColumns == "column") {
            status = "Error: col " + this.column + " is invalid.";
        } else if (this.rowsAndColumns == "Already Used") {
            status = "Error: slot @ (" + this.row + ", " + this.column + ") is already occupied.";
            this.rowsAndColumns = "";
        } else if (this.winner == this.player1) {
            status = "Game is over with " + this.winner + " being the winner.";
            this.winner = "winner";
        } else if (this.winner == this.player2) {
            status = "Game is over with " + this.winner + " being the winner.";
            this.winner = "winner";
        } else if (this.winner == "winner") {
            status = "Error: game is already over with a winner.";
        } else if (this.winner == "No Winner") {
            status = "Game is over with a tie between " + this.player1 + " and " + player2 + ".";
            this.winner = "tie";
        }  else if (this.winner == "tie") {
            status = "Error: game is already over with a tie.";
        } else {
            status = firstPlayer + "'s turn to play...";
        }
        return status;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setWhoPlaysFirst(char letter) {
        if (letter == 'o') {
            this.firstPlayer = this.player2;
        }
    }

    public void move(int row, int column) {
        this.row = row;
        this.column = column;
        if ((row < 0 || row > 3) && this.winner == null) {
            this.rowsAndColumns = "row";
        } else if ((column < 0 || column > 3) && this.winner == null) {
            this.rowsAndColumns = "column";
        } else if (row > 0 && row < 4 && column > 0 && column < 4 && this.winner == null) {
            if (this.firstPlayer == this.player1 && this.board[row - 1][column - 1] == '_') {
                this.board[row - 1][column - 1] = 'x';
                this.firstPlayer = this.player2;
            } else if (this.firstPlayer == this.player2 && this.board[row - 1][column - 1] == '_') {
                this.board[row - 1][column - 1] = 'o';
                this.firstPlayer = this.player1;
            } else if (this.board[row-1][column-1] != '_') {
                this.rowsAndColumns = "Already Used";
            }
        } if (this.board[0][0] == 'x' && this.board[1][0] == 'x' && this.board[2][0] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[0][1] == 'x' && this.board[1][1] == 'x' && this.board[2][1] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[0][2] == 'x' && this.board[1][2] == 'x' && this.board[2][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[0][0] == 'x' && this.board[0][1] == 'x' && this.board[0][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[1][0] == 'x' && this.board[1][1] == 'x' && this.board[1][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[2][0] == 'x' && this.board[2][1] == 'x' && this.board[2][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[0][0] == 'x' && this.board[1][1] == 'x' && this.board[2][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[2][0] == 'x' && this.board[1][1] == 'x' && this.board[0][2] == 'x') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player1;
            }
        } else if (this.board[0][0] == 'o' && this.board[1][0] == 'o' && this.board[2][0] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[0][1] == 'o' && this.board[1][1] == 'o' && this.board[2][1] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[0][2] == 'o' && this.board[1][2] == 'o' && this.board[2][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[0][0] == 'o' && this.board[0][1] == 'o' && this.board[0][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[1][0] == 'o' && this.board[1][1] == 'o' && this.board[1][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[2][0] == 'o' && this.board[2][1] == 'o' && this.board[2][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[0][0] == 'o' && this.board[1][1] == 'o' && this.board[2][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[2][0] == 'o' && this.board[1][1] == 'o' && this.board[0][2] == 'o') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = player2;
            }
        } else if (this.board[0][0] != '_' && this.board[0][1] != '_' && this.board[0][2] != '_' && this.board[1][0] != '_' && this.board[1][1] != '_' && this.board[1][2] != '_' && this.board[2][0] != '_' && this.board[2][1] != '_' && this.board[2][2] != '_') {
            if (this.winner == null) {
                this.firstPlayer = null;
                this.winner = "No Winner";
            }
        }
    }
}