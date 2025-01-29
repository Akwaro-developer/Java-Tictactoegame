import java.util.Scanner;
import java.util.Random;

// Main Class for the Game
public class TicTacToe {
    private final int size = 3;
    private final Cell[] board = new Cell[size * size];
    private final Player[] players = new Player[2]; // Array to hold 2 players

    // Constructor to initialize the board and players
    public TicTacToe(Player player1, Player player2) {
        for (int i = 0; i < board.length; i++) {
            board[i] = new Cell();
        }
        players[0] = player1;
        players[1] = player2;
    }

    // Display the board
    public void display() {
        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i].getRepresentation());
            if (i % size == size - 1) {
                System.out.println("|");
                if (i < board.length - 1) {
                    System.out.println("*************");
                }
            }
        }
    }

    // Check if a move is valid and not occupied
    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false;
        }
        return board[row * size + col].getRepresentation().equals("|   ");
    }

    // Updates the board at the specified row and column
    public void setOwner(int row, int col, Player player) {
        board[row * size + col].setRepresentation(player.getRepresentation());
    }

    // Check if the game is over
    private boolean isGameOver(Player player) {
        String symbol = "|" + player.getRepresentation();

        // Check rows
        for (int row = 0; row < size; row++) {
            if (board[row * size].getRepresentation().equals(symbol) &&
                    board[row * size + 1].getRepresentation().equals(symbol) &&
                    board[row * size + 2].getRepresentation().equals(symbol)) {
                return true;
            }
        }

        // Check columns
        for (int col = 0; col < size; col++) {
            if (board[col].getRepresentation().equals(symbol) &&
                    board[col + size].getRepresentation().equals(symbol) &&
                    board[col + 2 * size].getRepresentation().equals(symbol)) {
                return true;
            }
        }

        // Check diagonals
        if (board[0].getRepresentation().equals(symbol) &&
                board[4].getRepresentation().equals(symbol) &&
                board[8].getRepresentation().equals(symbol)) {
            return true;
        }

        if (board[2].getRepresentation().equals(symbol) &&
                board[4].getRepresentation().equals(symbol) &&
                board[6].getRepresentation().equals(symbol)) {
            return true;
        }

        return false;
    }

    // Main game logic
    public void play() {
        int moves = 0;
        boolean gameRunning = true;
        Player currentPlayer = players[0];

        while (gameRunning) {
            display();
            System.out.println(currentPlayer.getRepresentation() + "'s turn:");

            int[] move = currentPlayer.getMove(size, board);
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                setOwner(row, col, currentPlayer);
                moves++;

                if (isGameOver(currentPlayer)) {
                    display();
                    System.out.println(currentPlayer.getRepresentation() + " wins! 🎉");
                    gameRunning = false;
                } else if (moves == size * size) {
                    display();
                    System.out.println("It's a tie! 🤝");
                    gameRunning = false;
                } else {
                    currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

}