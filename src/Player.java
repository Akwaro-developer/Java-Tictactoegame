// Representation of player in the game
// Initializes the player with their marker X or O
abstract class Player {
    private final String representation;

    public Player(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }

    public abstract int[] getMove(int size, Cell[] board);
}

// Main Class
