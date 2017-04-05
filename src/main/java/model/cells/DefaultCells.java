package model.cells;

import com.google.common.collect.ImmutableList;
import lombok.Value;

import java.util.ArrayList;
import java.util.List;

@Value
public class DefaultCells implements Cells {
    
    private static final int EDGE_LENGTH = 8;

    private final int file;
    private final int rank;

    /**
     * Gets the list of cells in the same file including the reference cell.
     */
    public List<Cell> getCellsInTheSameFile() {
        List<Cell> cellsInTheSameFile = new ArrayList<Cell>();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsInTheSameFile.add(new DefaultCell(file, i));
        }
        return ImmutableList.copyOf(cellsInTheSameFile);
    }
    
    /**
     * Gets the list of cells in the same rank including the reference cell.
     **/
    public List<Cell> getCellsInTheSameRank() {
        List<Cell> cellsInTheSameRank = new ArrayList<Cell>();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsInTheSameRank.add(new DefaultCell(i, rank));
        }
        return ImmutableList.copyOf(cellsInTheSameRank);
    }
}
