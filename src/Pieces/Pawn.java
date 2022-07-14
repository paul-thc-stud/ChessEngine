package Pieces;

import Board.*;

public class Pawn extends Piece {
    final private int TWO_SQUARES = 2;
    final private int ONE_SQUARE = 1;
    private boolean isFirstMove;

    public Pawn(PieceColor pieceColor) {
        super(PieceType.PAWN, pieceColor);
        isFirstMove = true;
    }

    @Override
    public boolean isMoveValid(Move move, Board board) {
        if (!super.destOutOfBounds(move) && advancePawn(move) || capturePiece(move, board)) {
            board.getBoard()[move.dest().row()][move.dest().col()] = new Tile(this);
            board.getBoard()[move.origin().row()][move.origin().col()] = new Tile();
            return true;
        }

        return false;
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
                super.opponentPiece(move, board);
    }

    private boolean forwardMove(Move move) {
        int squaresTraveled = move.dest().row() - move.origin().row();

        return (super.pieceColor() == PieceColor.WHITE && squaresTraveled < 0) ||
                (super.pieceColor() == PieceColor.BLACK && squaresTraveled > 0);
    }
}
