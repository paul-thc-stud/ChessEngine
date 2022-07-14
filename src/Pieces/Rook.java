package Pieces;

import Board.Board;
import Board.Move;

public class Rook extends Piece {
    public Rook(PieceColor pieceColor) {
        super(PieceType.ROOK, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }
}
