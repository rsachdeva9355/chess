package model;

import model.pieces.Color;

/**
 * Represents a chess player.
 */
public interface Player {

    /**
     * Gets the color of piece player is playing with.
     */
    Color getPieceColor();

    /**
     * Makes a move given the board.
     */
    Move makeMove(Board board);
}
