package Pieces;

import Board.Board;
import Board.Move;

public class King extends Piece {
    private boolean isUnderCheck;

    public King(PieceColor pieceColor) {
        super(PieceType.KING, pieceColor);
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
