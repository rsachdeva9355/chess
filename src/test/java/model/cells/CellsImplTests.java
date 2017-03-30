package model.cells;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class CellsImplTests {

    @Test
    public void getCellsInTheSameFileShouldReturnExpectedCells() {
        Cells cell = new CellsImpl(1, 2);
        List<CellsImpl> expected = new ArrayList<CellsImpl>();
        for (int iter = 0; iter < 8; iter++) {
            expected.add(new CellsImpl(1, iter));
        }
        assertThat(cell.getCellsInTheSameFile(), containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void getCellsInSameRankShouldReturnExpectedCells() {
        Cells cell = new CellsImpl(1, 2);
        List<CellsImpl> expected = new ArrayList<CellsImpl>();
        for (int iter = 0; iter < 8; iter++) {
            expected.add(new CellsImpl(iter, 2));
        }
        assertThat(cell.getCellsInTheSameFile(), containsInAnyOrder(expected.toArray()));
    }
}
