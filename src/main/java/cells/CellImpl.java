package cells;

import lombok.Getter;

import java.util.List;

@Getter
public class CellImpl implements Cell {

    private final int file;
    private final int rank;

    CellImpl(int file, int rank) {
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
