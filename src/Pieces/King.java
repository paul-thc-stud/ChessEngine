package Pieces;

import Board.Block;
import Board.Move;

public class King extends Piece {
    public King(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    public boolean isUnderCheck(){
        return false;
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] borad) {
        return false;
    }
}
