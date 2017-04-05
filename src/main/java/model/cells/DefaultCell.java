package model.cells;

import lombok.Value;

@Value
class DefaultCell implements Cell {
    
    private final int file;
    private final int rank;
}
