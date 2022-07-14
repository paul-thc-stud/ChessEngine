package Pieces;

import Board.Board;
import Board.Move;

public class Queen extends Piece {
    public Queen(PieceColor pieceColor) {
        super(PieceType.QUEEN, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }
}
