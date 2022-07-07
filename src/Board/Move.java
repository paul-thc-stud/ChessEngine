package Board;

import Pieces.PieceType;


public class Move {
    private Block origin;
    private Block destination;
    private PieceType pieceToMove;

    public Move(Block origin, Block destination, PieceType pieceToMove) {
        this.origin = origin;
        this.destination = destination;
        this.pieceToMove = pieceToMove;
    }
}
