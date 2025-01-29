// This is the representation of individual cell in the game and holds the variable of the cell
public class Cell {
    private String representation = " "; // Default empty cell

    // This is the constructor
    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    // This is the getter for representation and allows to update content of the
    // cell and returns '|'
    public String getRepresentation() {
        return "| " + representation + " ";
    }
// This helps to avoid repetition
    public Boolean isOccupied() {
        return representation.equals(" ");
    }
}
