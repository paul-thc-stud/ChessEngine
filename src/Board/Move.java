package Board;

import Pieces.Piece;



public class Move {
    private Location origin;
    private Location dest;
    private Piece pieceToMove;

    public Move(Location origin, Location dest, Piece pieceToMove) {
        this.origin = origin;
        this.dest = dest;
        this.pieceToMove = pieceToMove;
    }

    public Location origin() {
        return origin;
    }

    public Location dest() {
        return dest;
    }

    public Piece getPieceToMove() {
        return pieceToMove;
    }
}
