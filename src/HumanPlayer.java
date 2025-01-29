
//


//

import java.util.Scanner;

class HumanPlayer extends Player {
    private final Scanner scanner = new Scanner(System.in);

    public HumanPlayer(String representation) {
        super(representation);
    }

    @Override
    public int[] getMove(int size, Cell[] board) {
        System.out.println("Enter your move (row and column):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new int[]{row, col};
    }

    @Override
    public int[] getMove(TicTacToe game) {
        return new int[0];
    }
}

