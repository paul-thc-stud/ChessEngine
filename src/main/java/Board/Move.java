package Board;

import Pieces.Piece;


public class Move {
    private Point origin;
    private Point dest;
    private Piece pieceToMove;

    public Move(Point origin, Point dest, Piece pieceToMove) {
        this.origin = origin;
        this.dest = dest;
        this.pieceToMove = pieceToMove;
    }

    public Point origin() {
        return new Point(origin);
    }

    public Point dest() {
        return new Point(dest);
    }

    public int distance() {
        return (int) Math.sqrt(Math.pow(this.dest().row() - this.origin().row(), 2) +
                Math.pow(this.dest().col() - this.origin().col(), 2));
    }

    public Point calcDirection() {
        int rowsTraveled = this.dest().row() - this.origin().row();
        int colsTraveled = this.dest().col() - this.origin().col();
        int distance = this.distance();

        return new Point((colsTraveled / distance),
                (rowsTraveled / distance));
    }

    public void execute(Board board) {
        if (this.pieceToMove.isMoveValid(this, board)) {
            board.getBoard()[this.dest().row()][this.dest().col()] = pieceToMove;
            board.getBoard()[this.origin().row()][this.origin().col()] = null;
            System.out.println("move executed successfully!");
        } else {
            System.out.println("failed to execute move!");
        }
    }

    public boolean destOutOfBounds() {
        final int BOARD_HEIGHT = 8;
        final int BOARD_LENGTH = 8;
        final int MIN_HEIGHT = 0;
        final int MIN_LENGTH = 0;

        return this.dest().col() < MIN_LENGTH || this.dest().col() > BOARD_HEIGHT ||
                this.dest().row() < MIN_HEIGHT || this.dest().row() > BOARD_LENGTH;
    }

    public boolean isValidDest(Board board) {
        return !destOutOfBounds() &&
                (board.getBoard()[this.dest().row()][this.dest().col()] == null ||
                        opponentPiece(board));
    }

    public boolean opponentPiece(Board board) {
        Piece dest = board.getBoard()[this.dest().row()][this.dest().col()];
        return dest != null && dest.pieceColor() != pieceToMove.pieceColor();
    }

    public boolean noPiecesBetween(Board board) {
        Point direction = this.calcDirection();
        Point squareToCheck = this.origin();

        for (int index = 0; index < this.distance() - 1; index++) {
            squareToCheck.addRow(direction.row());
            squareToCheck.addCol(direction.col());
            if (board.getBoard()[squareToCheck.row()][squareToCheck.col()] != null) {
                return false;
            }
        }

        return true;
    }
}
