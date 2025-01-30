import java.util.Scanner;
import java.util.Random;

// Main Class for the Game
public class TicTacToe {
    private final int size = 3;
    private final Cell[] board = new Cell[size * size];
    private final Player[] players = new Player[2];
    private final View view = new View();

    public TicTacToe(Player player1, Player player2) {
        for (int i = 0; i < board.length; i++) {
            board[i] = new Cell();
        }
        players[0] = player1;
        players[1] = player2;
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size && board[row * size + col].isOccupied();
    }

    public void setOwner(int row, int col, Player player) {
        board[row * size + col].setRepresentation(player.getRepresentation());
    }

    private boolean isGameOver(Player player) {
        String symbol = "|" + player.getRepresentation();

        for (int row = 0; row < size; row++) {
            if (board[row * size].getRepresentation().equals(symbol) &&
                    board[row * size + 1].getRepresentation().equals(symbol) &&
                    board[row * size + 2].getRepresentation().equals(symbol)) {
                return true;
            }
        }

        for (int col = 0; col < size; col++) {
            if (board[col].getRepresentation().equals(symbol) &&
                    board[col + size].getRepresentation().equals(symbol) &&
                    board[col + 2 * size].getRepresentation().equals(symbol)) {
                return true;
            }
        }

        return (board[0].getRepresentation().equals(symbol) &&
                board[4].getRepresentation().equals(symbol) &&
                board[8].getRepresentation().equals(symbol)) ||
                (board[2].getRepresentation().equals(symbol) &&
                        board[4].getRepresentation().equals(symbol) &&
                        board[6].getRepresentation().equals(symbol));
    }

    public void play() {
        int moves = 0;
        boolean gameRunning = true;
        Player currentPlayer = players[0];

        while (gameRunning) {
            view.displayBoard(board, size);
            view.showMessage(currentPlayer.getRepresentation() + "'s turn:");
            int[] move = currentPlayer.getMove(size, board);
            int row = move[0], col = move[1];

            if (isValidMove(row, col)) {
                setOwner(row, col, currentPlayer);
                moves++;

                if (isGameOver(currentPlayer)) {
                    view.displayBoard(board, size);
                    view.showMessage(currentPlayer.getRepresentation() + " wins! 🎉");
                    gameRunning = false;
                } else if (moves == size * size) {
                    view.displayBoard(board, size);
                    view.showMessage("It's a tie! 🤝");
                    gameRunning = false;
                } else {
                    currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
                }
            } else {
                view.showMessage("Invalid move! Try again.");
            }
        }
    }

}