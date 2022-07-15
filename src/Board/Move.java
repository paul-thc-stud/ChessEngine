package Board;

import Pieces.Piece;



public class Move {
    private Point origin;
    private Point dest;
    private Piece pieceToMove;

    public Move(Point origin, Point dest, Piece pieceToMove) {
        this.origin = origin;
        this.dest = dest;
        this.pieceToMove = pieceToMove;
    }

    public Point origin() {
        return origin;
    }

    public Point dest() {
        return dest;
    }

    public Piece getPieceToMove() {
        return pieceToMove;
    }
}
