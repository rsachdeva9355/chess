package model.pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class KingTests {

    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(King.class), is(true));
    }

    @Test
    public void canJumpShouldReturnFalse() {
        assertThat((new King()).canJump(), is(false));
    }
}
