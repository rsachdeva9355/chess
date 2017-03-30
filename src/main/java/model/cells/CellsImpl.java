package model.cells;

import lombok.Value;

import java.util.List;

@Value
public class CellsImpl implements Cells {

    private final int file;
    private final int rank;

    CellsImpl(int file, int rank) {
        this.file = file;
        this.rank = rank;
    }

    public List<Cell> getCellsInTheSameFile() {
        return null;
    }

    public List<Cell> getCellsInTheSameRank() {
        return null;
    }
}
