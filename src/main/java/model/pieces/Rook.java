package model.pieces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Value
public class Rook implements Piece {

    @NonNull
    private final Color color;

    public boolean canJump() {
        return false;
    }
}
