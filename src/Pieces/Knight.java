package Pieces;

import Board.Block;
import Board.Move;

public class Knight extends Piece {
    public Knight(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] board) {
        return false;
    }
}
