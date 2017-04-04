package model.cells.impl;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import model.cells.Cell;
import model.cells.Cells;

import java.util.ArrayList;
import java.util.List;

@Getter
@EqualsAndHashCode
public class CellsImpl implements Cells {
    
    private static final Integer EDGE_LENGTH = 8;

    private final int file;
    private final int rank;

    public CellsImpl(int file, int rank) {
        this.file = file;
        this.rank = rank;
    }
    
    /**
     * Gets the list of cells in the same file including the reference cell.
     */
    public List<Cell> getCellsInTheSameFile() {
        List<Cell> cellsInTheSameFile = new ArrayList<Cell>();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsInTheSameFile.add(new CellImpl(file, i));
        }
        return cellsInTheSameFile;
    }
    
    /**
     * Gets the list of cells in the same rank including the reference cell.
     **/
    public List<Cell> getCellsInTheSameRank() {
        List<Cell> cellsInTheSameRank = new ArrayList<Cell>();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsInTheSameRank.add(new CellImpl(i, rank));
        }
        return cellsInTheSameRank;
    }
}
