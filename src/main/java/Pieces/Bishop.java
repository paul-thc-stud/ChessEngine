package Pieces;

import Board.Board;
import Board.Move;

public class Bishop extends Piece {
    public Bishop(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.BISHOP.notationName());
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return move.isValidDest(board) && move.noPiecesBetween(board) && isMovingDiagonally(move);
    }
}
