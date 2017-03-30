package model.pieces;

/**
 * Represents a chess piece.
 */
public interface Piece {

    /**
     * If the piece can jump over other pieces.
     *
     * @return: true if yes, false otherwise.
     **/
    boolean canJump();
}
