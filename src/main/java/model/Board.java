package model;

import java.util.Collection;

/**
 * Represents a chess board. It contains a list of positioned pieces.
 */
public interface Board {

    /**
     * Returns possible moves with the current state of board.
     *
     * @return The collection of possible moves.
     */
    Collection<Move> getMoves();
}
