package Pieces;

import Board.Board;
import Board.Move;

public class Queen extends Piece {
    public Queen(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.QUEEN.notationName());
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }
}
