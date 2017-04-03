package model.cells.impl;

import constants.BoardConstants;
import lombok.Value;
import model.cells.Cell;
import model.cells.Cells;

import java.util.ArrayList;
import java.util.List;

@Value
public class CellsImpl implements Cells {

    private final int file;
    private final int rank;

    CellsImpl(int file, int rank) {
        this.file = file;
        this.rank = rank;
    }
    
    /**
     * Gets the list of cells in the same file including the reference cell.
     */
    public List<Cell> getCellsInTheSameFile() {
        List<Cell> cellsInTheSameFile = new ArrayList<Cell>(BoardConstants.EDGE_LENGTH);
        for (int i = 0; i < BoardConstants.EDGE_LENGTH; i++) {
            cellsInTheSameFile.add(new CellImpl(file, i));
        }
        return cellsInTheSameFile;
    }
    
    /**
     * Gets the list of cells in the same rank including the reference cell.
     **/
    public List<Cell> getCellsInTheSameRank() {
        List<Cell> cellsInTheSameRank = new ArrayList<Cell>(BoardConstants.EDGE_LENGTH);
        for (int i = 0; i < BoardConstants.EDGE_LENGTH; i++) {
            cellsInTheSameRank.add(new CellImpl(i, rank));
        }
        return cellsInTheSameRank;
    }
}
