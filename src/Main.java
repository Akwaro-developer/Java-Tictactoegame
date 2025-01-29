public class Main{
    public static void main(String[] args) {
        // This is for different configurations
        // 2 Human Players
        TicTacToe game = new TicTacToe(new HumanPlayer("❌"), new HumanPlayer("\uD83D\uDD18"));

        // 1 Human and 1 AI Player
        //TicTacToe game = new TicTacToe(new HumanPlayer("❌"), new ArtificialPlayer("\uD83D\uDD18"));

        // 2 AI Players
        //TicTacToe game = new TicTacToe(new ArtificialPlayer("X"), new ArtificialPlayer("O"));

        game.play();
    }
}

