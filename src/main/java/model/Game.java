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

    /**
     * Makes a turn. Finds out which player should move, passes board to it and makes the move.
     */
    void makeTurn();

    /**
     * Finds out if the game has ended or not. Makes use of board's stalemate and checkmate.
     */
    boolean hasEnded();
}
