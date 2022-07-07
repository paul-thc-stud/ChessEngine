package Pieces;

import Board.Block;
import Board.Move;

public class Bishop extends Piece {
    public Bishop(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] board) {
        return false;
    }
}
