import model.cells.Cell;

/**
 * Represents a move. It contains the destination cell and the positioned piece to move.
 */
public interface Move {

    /**
     * Gets the piece to be moved.
     *
     * @return  The postioned piece to be moved.
     */
    PositionedPiece getPiece();

    /**
     * Gets the cell to move to.
     *
     * @return  The cell to move the piece to.
     */
    Cell getDestinationPosition();
}
