package pieces;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class QueenTests {

    @Test
    public void isAssignableToPiece() {
        assertThat(Piece.class.isAssignableFrom(Queen.class), is(true));
    }

    @Test
    public void canJumpShouldReturnFalse() {
        assertThat((new Queen()).canJump(), is(false));
    }
}
