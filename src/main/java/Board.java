import model.cells.Cell;
import model.pieces.Color;
import model.pieces.Piece;

import java.util.Collection;

/**
 * Represents a chess board. It contains a list of positioned pieces.
 */
public interface Board {

    /**
     * Returns possible moves with the current state of board for a color.
     *
     */
    Collection<Move> getMoves(Color color);

    /**
     * Returns the piece at a given cell.
     */
    Piece getPiece(Cell cell);

    /**
     * Finds where a piece is present.
     */
    Cell findPiece(Piece piece);

    /**
     * Finds if the current state is checkmate.
     */
    boolean isCheckmate();

    /**
     * Finds if the current state is Stalamate.
     */
    boolean isStalemate();
}
