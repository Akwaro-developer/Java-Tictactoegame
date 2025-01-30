// This is the representation of individual cell in the game and holds the variable of the cell
public class Cell {
    private String representation = " ";

    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return "| " + representation + " ";
    }

    public Boolean isOccupied() {
        return representation.equals(" ");
    }
}
