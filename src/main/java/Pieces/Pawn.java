package Pieces;

import Board.Board;
import Board.Move;

public class Pawn extends Piece {
    private final int TWO_SQUARES = 2;
    private final int ONE_SQUARE = 1;
    private boolean isFirstMove;

    public Pawn(PieceColor pieceColor) {
        super(pieceColor);
        super.setPieceNotation(PieceType.PAWN.notationName());
        isFirstMove = true;
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        return !move.destOutOfBounds() && advancePawn(move) || capturePiece(move, board);
    }

    public void move(Move move, Board board) {
        if (isMoveValid(move, board)) {
            board.getBoard()[move.dest().row()][move.dest().col()] = this;
            board.getBoard()[move.origin().row()][move.origin().col()] = null;
        }
        //throw illegal move exception
    }

    private boolean advancePawn(Move move) {
        int squaresTraveled = Math.abs(move.dest().row() - move.origin().row());
        boolean advance = (move.dest().col() - move.origin().col()) == 0;
        boolean forwardMove = forwardMove(move);

        if (advance && forwardMove && squaresTraveled == ONE_SQUARE ||
                forwardMove && isFirstMove && advance && squaresTraveled == TWO_SQUARES) {
            if (isFirstMove) {
                isFirstMove = false;
            }

            return true;
        }

        return false;
    }

    private boolean capturePiece(Move move, Board board) {
        int rowsTraveled = Math.abs(move.dest().row() - move.origin().row());
        int colsTraveled = Math.abs(move.dest().row() - move.origin().row());

        return forwardMove(move) && rowsTraveled == ONE_SQUARE && colsTraveled == ONE_SQUARE &&
                move.opponentPiece(board);
    }

    private boolean forwardMove(Move move) {
        int squaresTraveled = move.dest().row() - move.origin().row();

        return (super.pieceColor() == PieceColor.WHITE && squaresTraveled < 0) ||
                (super.pieceColor() == PieceColor.BLACK && squaresTraveled > 0);
    }
}
