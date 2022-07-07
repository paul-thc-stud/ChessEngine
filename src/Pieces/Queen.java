package Pieces;

import Board.Block;
import Board.Move;

public class Queen extends Piece {
    public Queen(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] borad) {
        return false;
    }
}
