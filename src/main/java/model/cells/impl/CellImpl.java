package model.cells.impl;

import lombok.Value;
import model.cells.Cell;

@Value
public class CellImpl implements Cell {
    
    private final int file;
    private final int rank;
    
    public int getRank() {
        return 0;
    }
    
    public int getFile() {
        return 0;
    }
}
