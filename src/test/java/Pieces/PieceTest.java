package Pieces;

import Board.Board;
import Board.Move;
import Board.Point;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PieceTest {
    private final int BOARD_HEIGHT = 8;
    private final int BOARD_LENGTH = 8;
    private Queen queen;
    private Board board = new Board();
    private Move move;

    @Before
    public void setup() {
        queen = new Queen(PieceColor.WHITE);
    }

    @Test
    public void noPiecesBetween_noPieces_straight() {
        move = new Move(new Point(3, 0), new Point(3, 5), queen);
        Piece[][] boardPieces = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        boardPieces[0][0] = new Rook(PieceColor.WHITE);
        boardPieces[0][1] = new Knight(PieceColor.WHITE);
        boardPieces[0][2] = new Bishop(PieceColor.WHITE);
        boardPieces[0][3] = new Queen(PieceColor.WHITE);
        boardPieces[0][4] = new King(PieceColor.WHITE);
        boardPieces[0][5] = new Bishop(PieceColor.WHITE);
        boardPieces[0][6] = new Knight(PieceColor.WHITE);
        boardPieces[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            boardPieces[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        boardPieces[1][3] = null;

        boardPieces[7][0] = new Rook(PieceColor.BLACK);
        boardPieces[7][1] = new Knight(PieceColor.BLACK);
        boardPieces[7][2] = new Bishop(PieceColor.BLACK);
        boardPieces[7][3] = new Queen(PieceColor.BLACK);
        boardPieces[7][4] = new King(PieceColor.BLACK);
        boardPieces[7][5] = new Bishop(PieceColor.BLACK);
        boardPieces[7][6] = new Knight(PieceColor.BLACK);
        boardPieces[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            boardPieces[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }

        board.setBoard(boardPieces);

        assertTrue(move.noPiecesBetween(board));

        System.out.println("#TEST 1");
        board.printBoard();
    }

    @Test
    public void noPiecesBetween_Pieces_RightDown() {
        move = new Move(new Point(3, 0), new Point(5, 2), queen);
        Piece[][] boardPieces = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        boardPieces[0][0] = new Rook(PieceColor.WHITE);
        boardPieces[0][1] = new Knight(PieceColor.WHITE);
        boardPieces[0][2] = new Bishop(PieceColor.WHITE);
        boardPieces[0][3] = new Queen(PieceColor.WHITE);
        boardPieces[0][4] = new King(PieceColor.WHITE);
        boardPieces[0][5] = new Bishop(PieceColor.WHITE);
        boardPieces[0][6] = new Knight(PieceColor.WHITE);
        boardPieces[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            boardPieces[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        boardPieces[7][0] = new Rook(PieceColor.BLACK);
        boardPieces[7][1] = new Knight(PieceColor.BLACK);
        boardPieces[7][2] = new Bishop(PieceColor.BLACK);
        boardPieces[7][3] = new Queen(PieceColor.BLACK);
        boardPieces[7][4] = new King(PieceColor.BLACK);
        boardPieces[7][5] = new Bishop(PieceColor.BLACK);
        boardPieces[7][6] = new Knight(PieceColor.BLACK);
        boardPieces[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            boardPieces[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }

        board.setBoard(boardPieces);

        assertFalse(move.noPiecesBetween(board));

        System.out.println("#TEST 2");
        board.printBoard();
    }

    @Test
    public void noPiecesBetween_noPieces_RightDown() {
        move = new Move(new Point(3, 0), new Point(5, 2), queen);
        Piece[][] boardPieces = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        boardPieces[0][0] = new Rook(PieceColor.WHITE);
        boardPieces[0][1] = new Knight(PieceColor.WHITE);
        boardPieces[0][2] = new Bishop(PieceColor.WHITE);
        boardPieces[0][3] = new Queen(PieceColor.WHITE);
        boardPieces[0][4] = new King(PieceColor.WHITE);
        boardPieces[0][5] = new Bishop(PieceColor.WHITE);
        boardPieces[0][6] = new Knight(PieceColor.WHITE);
        boardPieces[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            boardPieces[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        boardPieces[1][4] = null;

        boardPieces[7][0] = new Rook(PieceColor.BLACK);
        boardPieces[7][1] = new Knight(PieceColor.BLACK);
        boardPieces[7][2] = new Bishop(PieceColor.BLACK);
        boardPieces[7][3] = new Queen(PieceColor.BLACK);
        boardPieces[7][4] = new King(PieceColor.BLACK);
        boardPieces[7][5] = new Bishop(PieceColor.BLACK);
        boardPieces[7][6] = new Knight(PieceColor.BLACK);
        boardPieces[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            boardPieces[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }

        board.setBoard(boardPieces);

        assertTrue(move.noPiecesBetween(board));

        System.out.println("#TEST 3");
        board.printBoard();
    }

    @Test
    public void noPiecesBetween_Pieces_LeftDown() {
        move = new Move(new Point(3, 0), new Point(1, 2), queen);
        Piece[][] boardPieces = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        boardPieces[0][0] = new Rook(PieceColor.WHITE);
        boardPieces[0][1] = new Knight(PieceColor.WHITE);
        boardPieces[0][2] = new Bishop(PieceColor.WHITE);
        boardPieces[0][3] = new Queen(PieceColor.WHITE);
        boardPieces[0][4] = new King(PieceColor.WHITE);
        boardPieces[0][5] = new Bishop(PieceColor.WHITE);
        boardPieces[0][6] = new Knight(PieceColor.WHITE);
        boardPieces[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            boardPieces[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        boardPieces[7][0] = new Rook(PieceColor.BLACK);
        boardPieces[7][1] = new Knight(PieceColor.BLACK);
        boardPieces[7][2] = new Bishop(PieceColor.BLACK);
        boardPieces[7][3] = new Queen(PieceColor.BLACK);
        boardPieces[7][4] = new King(PieceColor.BLACK);
        boardPieces[7][5] = new Bishop(PieceColor.BLACK);
        boardPieces[7][6] = new Knight(PieceColor.BLACK);
        boardPieces[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            boardPieces[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }

        board.setBoard(boardPieces);

        assertFalse(move.noPiecesBetween(board));

        System.out.println("#TEST 4");
        board.printBoard();
    }

    @Test
    public void noPiecesBetween_noPieces_LeftDown() {
        move = new Move(new Point(3, 0), new Point(1, 2), queen);
        Piece[][] boardPieces = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        boardPieces[0][0] = new Rook(PieceColor.WHITE);
        boardPieces[0][1] = new Knight(PieceColor.WHITE);
        boardPieces[0][2] = new Bishop(PieceColor.WHITE);
        boardPieces[0][3] = new Queen(PieceColor.WHITE);
        boardPieces[0][4] = new King(PieceColor.WHITE);
        boardPieces[0][5] = new Bishop(PieceColor.WHITE);
        boardPieces[0][6] = new Knight(PieceColor.WHITE);
        boardPieces[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            boardPieces[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        boardPieces[1][2] = null;

        boardPieces[7][0] = new Rook(PieceColor.BLACK);
        boardPieces[7][1] = new Knight(PieceColor.BLACK);
        boardPieces[7][2] = new Bishop(PieceColor.BLACK);
        boardPieces[7][3] = new Queen(PieceColor.BLACK);
        boardPieces[7][4] = new King(PieceColor.BLACK);
        boardPieces[7][5] = new Bishop(PieceColor.BLACK);
        boardPieces[7][6] = new Knight(PieceColor.BLACK);
        boardPieces[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            boardPieces[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }

        board.setBoard(boardPieces);

        assertTrue(move.noPiecesBetween(board));

        System.out.println("#TEST 4");
        board.printBoard();
    }
}