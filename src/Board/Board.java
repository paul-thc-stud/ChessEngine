package Board;

import Pieces.*;

public class Board {
    private final int BOARD_HEIGHT = 8;
    private final int BOARD_LENGTH = 8;
    private Tile[][] board;

    public Board() {
        this.board = initBoard();
    }

    public Tile[][] getBoard() {
        return this.board;
    }

    public void printBoard() {
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int column = 0; column < BOARD_LENGTH; column++) {
                if (!this.board[row][column].isOccupied()) {
                    System.out.print("  ");
                } else {
                    System.out.print(" " + this.board[row][column]);
                }
            }
            System.out.println();
        }
    }

    private Tile[][] initBoard() {
        board = new Tile[BOARD_HEIGHT][BOARD_LENGTH];

        board[0][0] = new Tile(new Rook(PieceColor.WHITE));
        board[0][1] = new Tile(new Knight(PieceColor.WHITE));
        board[0][2] = new Tile(new Bishop(PieceColor.WHITE));
        board[0][3] = new Tile(new Queen(PieceColor.WHITE));
        board[0][4] = new Tile(new King(PieceColor.WHITE));
        board[0][5] = new Tile(new Bishop(PieceColor.WHITE));
        board[0][6] = new Tile(new Knight(PieceColor.WHITE));
        board[0][7] = new Tile(new Rook(PieceColor.WHITE));

        for (int i = 0; i < 8; i++) {
            board[1][i] = new Tile(new Pawn(PieceColor.WHITE));
        }

        for (int row = 2; row < 7; row++) {
            for (int col = 0; col < 8; col++) {
                board[row][col] = new Tile();
            }
        }

        board[7][0] = new Tile(new Rook(PieceColor.BLACK));
        board[7][1] = new Tile(new Knight(PieceColor.BLACK));
        board[7][2] = new Tile(new Bishop(PieceColor.BLACK));
        board[7][3] = new Tile(new Queen(PieceColor.BLACK));
        board[7][4] = new Tile(new King(PieceColor.BLACK));
        board[7][5] = new Tile(new Bishop(PieceColor.BLACK));
        board[7][6] = new Tile(new Knight(PieceColor.BLACK));
        board[7][7] = new Tile(new Rook(PieceColor.BLACK));

        for (int i = 0; i < 8; i++) {
            board[6][i] = new Tile(new Pawn(PieceColor.BLACK));
        }

        return board;
    }
}
