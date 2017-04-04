package model.pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class KnightTests {
    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(Knight.class), is(true));
    }

    @Test
    public void canJumpShouldReturnTrue() {
        assertThat((new Knight(Color.WHITE)).canJump(), is(true));
    }
}
