package Pieces;

import Board.Board;
import Board.Move;

public class Knight extends Piece {
    public Knight(PieceColor pieceColor) {
        super(PieceType.KNIGHT, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return false;
    }

}
