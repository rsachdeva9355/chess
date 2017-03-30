package model.pieces;

/**
 * Represents a chess piece.
 */
public interface Piece {

    /**
     * If the piece can jump over other pieces.
     **/
    boolean canJump();

    /**
     * Gets the color of the piece.
     */
    Color getColor();
}
