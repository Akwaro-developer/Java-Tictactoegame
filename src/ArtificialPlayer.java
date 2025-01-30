import java.util.Random;

public class ArtificialPlayer extends Player {
    private final Random random = new Random();

    public ArtificialPlayer(String representation) {
        super(representation);
    }

    @Override
    public int[] getMove(int size, Cell[] board) {
        int row, col;
        do {
            row = random.nextInt(size);
            col = random.nextInt(size);
        } while (!board[row * size + col].isOccupied());
        return new int[]{row, col};
    }
}
