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
        } while (!board[row * size + col].getRepresentation().equals("|   "));
        System.out.println("AI chooses: " + row + " " + col);
        return new int[]{row, col};
    }

    @Override
    public int[] getMove(TicTacToe game) {
        return new int[0];
    }
}
