public class Main {
    public static void main(String[] args) {
        UserInteraction userInteraction = new UserInteraction();
        TicTacToe game = new TicTacToe(new HumanPlayer("❌", userInteraction), new ArtificialPlayer("⚪"));
        game.play();
        userInteraction.close();
    }
}