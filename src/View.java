public class View {
    public void displayBoard(Cell[] board, int size) {
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

    public void showMessage(String message) {
        System.out.println(message);
    }
}
