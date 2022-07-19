package Pieces;

import Board.Board;
import Board.Move;

public class Knight extends Piece {
    public Knight(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.KNIGHT.notationName());
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }

}
