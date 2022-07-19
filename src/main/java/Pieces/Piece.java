package Pieces;

import Board.*;

public abstract class Piece {
    private PieceColor pieceColor;
    private String pieceNotation;

    public Piece(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public void setPieceNotation(String pieceNotation) {
        this.pieceNotation = pieceNotation;
    }

    public PieceColor pieceColor() {
        return pieceColor;
    }

    public abstract boolean isMoveValid(Move move, Board board);

    public boolean isMovingStraight(Move move) {
        int rowsTraveled = move.dest().row() - move.origin().row();
        int colsTraveled = move.dest().col() - move.origin().col();

        return rowsTraveled == 0 && colsTraveled != 0 ||
                colsTraveled == 0 && rowsTraveled != 0;
    }

    public boolean isMovingDiagonally(Move move) {
        Point direction = move.calcDirection();

        return direction.equals(Directions.RIGHT_UP.direction()) ||
                direction.equals(Directions.RIGHT_DOWN.direction()) ||
                direction.equals(Directions.LEFT_UP.direction()) ||
                direction.equals(Directions.LEFT_DOWN.direction());
    }

    @Override
    public String toString() {
        return this.pieceNotation;
    }

    //public abstract ArrayList<Move> possibleMoves();
}

