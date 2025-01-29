import java.util.Scanner;
import java.util.Random;

// Main Class for the Game
public class TicTacToe {
    //I am defining the size of the tictactoe game
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
    //Prints the board row by row.
    //After every 3 cells (size), it prints a newline to create the board structure.

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
    //Updates the cell’s representation with the player’s symbol (X or O).
    public void setOwner(int row, int col, Player player) {
        board[row * size + col].setRepresentation(player.getRepresentation());
    }

    // Check if the game is over
    private boolean isGameOver(Player player) {
        String symbol = "|" + player.getRepresentation();

        // Check rows
        //Iterates through each row.
        //Checks if all 3 cells in a row have the same player's symbol.
        for (int row = 0; row < size; row++) {
            if (board[row * size].getRepresentation().equals(symbol) &&
                    board[row * size + 1].getRepresentation().equals(symbol) &&
                    board[row * size + 2].getRepresentation().equals(symbol)) {
                return true;
            }
        }

        // Check columns
        //Iterates through each column
        //Checks if all 3 cells in a column have the same players symbol
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

        //currentPlayer: Tracks the active player.
        Player currentPlayer = players[0];

        // Looping until the game ends
        while (gameRunning) {
            display();
            System.out.println(currentPlayer.getRepresentation() + "'s turn:");
//retrieves the move (row, col) from the player.

            int[] move = currentPlayer.getMove(size, board);
            int row = move[0];
            int col = move[1];
//Keeps track of the number of moves (max 9).
            //If the move is valid, update the board and increment the move count.

            if (isValidMove(row, col)) {
                setOwner(row, col, currentPlayer);
                moves++;

                if (isGameOver(currentPlayer)) {
                    display();
                    System.out.println(currentPlayer.getRepresentation() + " wins! 🎉");
                    gameRunning = false;

                    //If the current player wins, display the final board and end the game.

                } else if (moves == size * size) {
                    display();
                    System.out.println("It's a tie! 🤝");
                    gameRunning = false;
                } else {

                    //If all 9 cells are filled without a winner, declare a tie.
                    currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
                }
            } else {

                //If the move is invalid, prompt the player to try again
                System.out.println("Invalid move! Try again.");
            }
        }
    }

}