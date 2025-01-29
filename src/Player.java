// Representation of player in the game
// Initializes the player with their marker X or O
abstract class Player {
    private final String representation;

    public Player(String representation) {
        this.representation = representation;
    }
//Getter for the symbol
    public String getRepresentation() {
        return representation;
    }

    // Generate a random valid move

    // Get the move from the human player
    public abstract int[] getMove(int size, Cell[] board);

    public abstract int[] getMove(TicTacToe game);
}

// Main Class
