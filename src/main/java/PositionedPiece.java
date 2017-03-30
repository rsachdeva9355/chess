import model.cells.Cell;
import model.pieces.Piece;

import java.util.List;

/**
 * Represents a positioned piece. It is composed of a cell and piece object.
 */
public interface PositionedPiece {

    /**
     * Gets all the possible moves assuming that there is no other piece on the board.
     *
     * @return  List of moves represented object can make.
     */
    List<Move> getMoves();

    /**
     * Gets the position of the piece.
     *
     * @return  the cell on which piece is positioned.
     */
    Cell getPosition();

    /**
     * Gets the positioned piece.
     *
     * @return the positioned piece.
     */
    Piece getPiece();
}
