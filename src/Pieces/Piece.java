package Pieces;

import Board.Board;
import Board.Move;
import Board.Tile;

public abstract class Piece {
    private PieceType pieceType;
    private PieceColor pieceColor;

    public Piece(PieceType pieceType, PieceColor pieceColor) {
        this.pieceType = pieceType;
        this.pieceColor = pieceColor;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public PieceColor pieceColor() {
        return pieceColor;
    }

    public abstract boolean isMoveValid(Move move, Board board);

    public boolean opponentPiece(Move move, Board board) {
        Tile dest = board.getBoard()[move.dest().row()][move.dest().col()];
        return dest.isOccupied() && dest.piece().pieceColor() != this.pieceColor();
    }

    public boolean destOutOfBounds(Move move) {
        final int BOARD_HEIGHT = 8;
        final int BOARD_LENGTH = 8;
        final int MIN_HEIGHT = 0;
        final int MIN_LENGTH = 0;

        return move.dest().col() < MIN_LENGTH || move.dest().col() > BOARD_HEIGHT ||
                move.dest().row() < MIN_HEIGHT || move.dest().row() > BOARD_LENGTH;
    }

    //public abstract ArrayList<Move> possibleMoves();
}

