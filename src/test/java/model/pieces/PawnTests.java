package model.pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PawnTests {

    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(Pawn.class), is(true));
    }

    @Test
    public void canJumpShouldReturnFalse() {
        assertThat((new Pawn()).canJump(), is(false));
    }
}
