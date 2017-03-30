package model;

/**
 * Represents a chess game. Consists of a board with initial state and 2 players.
 */
public interface Game {

    /**
     * Gets the player with white pieces.
     */
    Player getPlayerWithWhitePieces();


    /**
     * Gets the player with black pieces.
     */
    Player getPlayerWithBlackPieces();
}
