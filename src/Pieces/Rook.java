package Pieces;

import Board.Board;
import Board.Move;

public class Rook extends Piece {
    public Rook(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.ROOK.notationName());
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }
}
