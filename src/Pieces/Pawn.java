package Pieces;

import Board.Block;
import Board.Move;

public class Pawn extends Piece{
    private boolean isFirstMove;

    public Pawn(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
        isFirstMove = true;
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] board) {
        return false;
    }
}
