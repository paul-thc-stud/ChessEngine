package Pieces;

import Board.Board;
import Board.Move;

public class Bishop extends Piece {
    public Bishop(PieceColor pieceColor) {
        super(PieceType.BISHOP, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }
}
