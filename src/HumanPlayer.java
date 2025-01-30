class HumanPlayer extends Player {
    private final UserInteraction userInteraction;

    public HumanPlayer(String representation, UserInteraction userInteraction) {
        super(representation);
        this.userInteraction = userInteraction;
    }

    @Override
    public int[] getMove(int size, Cell[] board) {
        return userInteraction.getPlayerMove();
    }
}