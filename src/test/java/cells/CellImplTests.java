package cells;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;


public class CellImplTests {

    @Test
    public void getCellsInTheSameFileShouldReturnExpectedCells() {
        Cell cell = new CellImpl(1, 2);
        List<Cell> expected = new ArrayList<Cell>();
        for (int iter = 0; iter < 8; iter++) {
            expected.add(new CellImpl(1, iter));
        }
        assertThat(cell.getCellsInTheSameFile(), containsInAnyOrder(expected.toArray()));
    }

    @Test
    public void getCellsInSameRankShouldReturnExpectedCells() {
        Cell cell = new CellImpl(1, 2);
        List<Cell> expected = new ArrayList<Cell>();
        for (int iter = 0; iter < 8; iter++) {
            expected.add(new CellImpl(iter, 2));
        }
        assertThat(cell.getCellsInTheSameFile(), containsInAnyOrder(expected.toArray()));
    }
}
