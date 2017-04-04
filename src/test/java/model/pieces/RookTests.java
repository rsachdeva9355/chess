package model.pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RookTests {

    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(Rook.class), is(true));
    }

    @Test
    public void canJumpShouldReturnFalse() {
        assertThat((new Rook(Color.WHITE)).canJump(), is(false));
    }
}
