package model.cells;

import java.util.List;

/**
 * Deals with the operations involving multiple cells.
 */
public interface Cells {

    /**
     * Gets the list of cells in the same file including the reference cell.
     *
     * Example: for cell at (1, 2)
     *          list of cells in the same file: [(1, 0), (1, 1), (1, 2), (1, 3), (1, 4), (1, 5), (1, 6), (1, 7)]
     */
    List<Cell> getCellsInTheSameFile();

    /**
     * Gets the list of cells in the same rank including the reference cell.
     *
     * Example: for cell at (1, 2)
     *          list of cells in the same file: [(0, 2), (1, 2), (2, 2), (3, 2), (4, 2), (5, 2), (6, 2), (7, 2)]
     */
    List<Cell> getCellsInTheSameRank();
}
