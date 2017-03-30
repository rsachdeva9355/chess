import model.pieces.Color;

/**
 * Represents a chess player.
 */
public interface Player {

    /**
     * Gets the name of player.
     */
    String playerName();

    /**
     * Gets the color of piece player is playing with.
     */
    Color getPieceColor();

    /**
     * Makes a move given the board.
     */
    Move makeMove(Board board);
}
