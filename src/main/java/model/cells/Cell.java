package model.cells;

/**
 * Represents on cell on a chess board.
 */
public interface Cell {

    /**
     * Gets the rank number of the cell.
     *
     * @return The rank number of the cell in range [0, 7].
     */
    public int getRank();

    /**
     * Gets the file number of the cell.
     *
     * @return The file number of the cell in range [0, 7].
     */
    public int getFile();

}
