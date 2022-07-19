package Board;

import Pieces.*;

public class Board {
    private final int BOARD_HEIGHT = 8;
    private final int BOARD_LENGTH = 8;
    private Piece[][] board;

    public Board() {
        this.board = initBoard();
    }

    public Piece[][] getBoard() {
        return this.board;
    }

    public void printBoard() {
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int column = 0; column < BOARD_LENGTH; column++) {
                if (this.board[row][column] == null) {
                    System.out.print("  ");
                } else {
                    System.out.print(" " + this.board[row][column]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    private Piece[][] initBoard() {
        board = new Piece[BOARD_HEIGHT][BOARD_LENGTH];

        board[0][0] = new Rook(PieceColor.WHITE);
        board[0][1] = new Knight(PieceColor.WHITE);
        board[0][2] = new Bishop(PieceColor.WHITE);
        board[0][3] = new Queen(PieceColor.WHITE);
        board[0][4] = new King(PieceColor.WHITE);
        board[0][5] = new Bishop(PieceColor.WHITE);
        board[0][6] = new Knight(PieceColor.WHITE);
        board[0][7] = new Rook(PieceColor.WHITE);

        final int WHITE_PAWN_ROW = 1;
        for (int col = 0; col < 8; col++) {
            board[WHITE_PAWN_ROW][col] = new Pawn(PieceColor.WHITE);
        }

        board[7][0] = new Rook(PieceColor.BLACK);
        board[7][1] = new Knight(PieceColor.BLACK);
        board[7][2] = new Bishop(PieceColor.BLACK);
        board[7][3] = new Queen(PieceColor.BLACK);
        board[7][4] = new King(PieceColor.BLACK);
        board[7][5] = new Bishop(PieceColor.BLACK);
        board[7][6] = new Knight(PieceColor.BLACK);
        board[7][7] = new Rook(PieceColor.BLACK);

        final int BLACK_PAWN_ROW = 6;
        for (int col = 0; col < 8; col++) {
            board[BLACK_PAWN_ROW][col] = new Pawn(PieceColor.BLACK);
        }


        return board;
    }
}
