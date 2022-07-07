package Pieces;

import Board.Block;
import Board.Move;

public abstract class Piece {
    private PieceType pieceType;
    private PieceColor pieceColor;

    public Piece(PieceType pieceType, PieceColor pieceColor) {
        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    }

    abstract public boolean isMoveValid(Move move, Block[][] board);

    public PieceType pieceType() {
        return this.pieceType;
    }
}
