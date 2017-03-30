package model.pieces;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Value
class Knight implements Piece {

    @NonNull
    private final Color color;

    public boolean canJump() {
        return true;
    }
}
