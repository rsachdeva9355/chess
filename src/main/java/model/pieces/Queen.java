package model.pieces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Value
public class Queen implements Piece {

    private final Color color;

    public boolean canJump() {
        return false;
    }
}
