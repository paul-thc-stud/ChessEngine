package Pieces;

import Board.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueenTest {

    private Board board;
    private Piece queen;
    private Point origin;
    private Point dest;

    @Before
    public void setup(){
        board = new Board();
        queen = new Queen(PieceColor.WHITE);
    }

    @Test
    public void isMoveValid_validStraightMove() {
        board.getBoard()[1][3] = null;
        origin = new Point(3, 0);
        dest = new Point(3, 5);
        Move move = new Move(origin, dest, queen);

        assertTrue(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_invalidStraightMove() {
        origin = new Point(3, 0);
        dest = new Point(3, 5);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertFalse(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_validDiagonallyMove() {
        board.getBoard()[1][4] = null;
        origin = new Point(3, 0);
        dest = new Point(5, 2);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertTrue(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_invalidDiagonallyMove() {
        origin = new Point(3, 0);
        dest = new Point(5, 2);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertFalse(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_invalidNotStraightOrDiagonally() {
        board.getBoard()[1][4] = null;
        origin = new Point(3, 0);
        dest = new Point(6, 2);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertFalse(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_invalidDestOccupied() {
        board.getBoard()[1][3] = null;
        board.getBoard()[5][3] = new Pawn(PieceColor.WHITE);
        origin = new Point(3, 0);
        dest = new Point(3, 5);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertFalse(queen.isMoveValid(move, board));
    }

    @Test
    public void isMoveValid_validDestOccupied() {
        board.getBoard()[1][3] = null;
        board.getBoard()[5][3] = new Pawn(PieceColor.BLACK);
        origin = new Point(3, 0);
        dest = new Point(3, 5);
        Move move = new Move(origin, dest, queen);
        board.printBoard();

        assertTrue(queen.isMoveValid(move, board));
    }
}