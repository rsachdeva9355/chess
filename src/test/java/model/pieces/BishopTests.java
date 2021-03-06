package model.pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BishopTests {

    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(Bishop.class), is(true));
    }

    @Test
    public void canJumpShouldReturnFalse() {
        assertThat((new Bishop()).canJump(), is(false));
    }
}
