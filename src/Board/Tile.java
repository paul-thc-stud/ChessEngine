package Board;

import Pieces.Piece;
import Pieces.PieceType;

public class Tile {
    private boolean isOccupied;
    private Piece piece;

    public Tile(Piece piece) {
        this.isOccupied = true;
        this.piece = piece;
    }

    public Tile() {
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public Piece piece() {
        return piece;
    }

    @Override
    public String toString() {
        return this.piece != null ?
                this.piece().getPieceType().notationName() : PieceType.EMPTY.notationName();
    }
}
