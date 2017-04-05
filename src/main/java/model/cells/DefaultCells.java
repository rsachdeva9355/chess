package model.cells;

import com.google.common.collect.ImmutableList;
import lombok.Value;

import java.util.List;

@Value
class DefaultCells implements Cells {
    
    private static final int EDGE_LENGTH = 8;

    private final int file;
    private final int rank;

    /**
     * Gets the list of cells in the same file including the reference cell.
     */
    public List<Cell> getCellsInTheSameFile() {
        ImmutableList.Builder<Cell> cellsBuilder = ImmutableList.builder();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsBuilder.add(new DefaultCell(file, i));
        }
        return cellsBuilder.build();
    }
    
    /**
     * Gets the list of cells in the same rank including the reference cell.
     **/
    public List<Cell> getCellsInTheSameRank() {
        ImmutableList.Builder<Cell> cellsBuilder = ImmutableList.builder();
        for (int i = 0; i < EDGE_LENGTH; i++) {
            cellsBuilder.add(new DefaultCell(i, rank));
        }
        return cellsBuilder.build();
    }
}
