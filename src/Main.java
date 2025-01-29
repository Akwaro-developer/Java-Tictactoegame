public class Main{
    public static void main(String[] args) {
        // This is for different configurations
        // 2 Human Players
        // TicTacToe game = new TicTacToe(new HumanPlayer("X"), new HumanPlayer("O"));

        // 1 Human and 1 AI Player
        TicTacToe game = new TicTacToe(new HumanPlayer("X"), new ArtificialPlayer("O"));

        // 2 AI Players
        //TicTacToe game = new TicTacToe(new ArtificialPlayer("X"), new ArtificialPlayer("O"));

        game.play();
    }
}

