package Pieces;

import Board.Block;
import Board.Move;

public class Rook extends Piece {
    public Rook(PieceType pieceType, PieceColor pieceColor) {
        super(pieceType, pieceColor);
    }

    @Override
    public boolean isMoveValid(Move move, Block[][] board) {
        return false;
    }
}
