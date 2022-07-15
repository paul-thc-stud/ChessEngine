package Pieces;

import Board.Board;
import Board.Move;

public class King extends Piece {
    private boolean isUnderCheck;

    public King(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.KING.notationName());
        this.isUnderCheck = false;
    }

    public boolean isUnderCheck(){
        return false;
    }

    @Override
    public boolean isMoveValid(Move move, Board borad) {
        return false;
    }
}
