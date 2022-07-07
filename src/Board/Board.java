package Board;

import Pieces.Piece;
import Pieces.PieceType;

public class Board {
    private final int BOARD_HEIGHT = 8;
    private final int BOARD_LENGTH = 8;
    private PieceType[][] board;

    public Board() {
        this.board = initBoard();
    }

    public PieceType[][] getBoard() {
        return this.board;
    }

    public void printBoard(){
        for (int row = 0; row < BOARD_HEIGHT; row++) {
            for (int column = 0; column < BOARD_LENGTH; column++) {
                System.out.print(" " + this.board[row][column].notationName());
            }
            System.out.println();
        }
    }

    private PieceType[][] initBoard(){
        PieceType[][] board = {
                {PieceType.ROOK, PieceType.KNIGHT, PieceType.BISHOP, PieceType.QUEEN,
                        PieceType.KING, PieceType.BISHOP, PieceType.KNIGHT, PieceType.ROOK},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN,
                        PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY,
                        PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY},
                {PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY,
                        PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY},
                {PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY,
                        PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY},
                {PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY,
                        PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY, PieceType.EMPTY},
                {PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN,
                        PieceType.PAWN, PieceType.PAWN, PieceType.PAWN, PieceType.PAWN},
                {PieceType.ROOK, PieceType.KNIGHT, PieceType.BISHOP, PieceType.QUEEN,
                        PieceType.KING, PieceType.BISHOP, PieceType.KNIGHT, PieceType.ROOK}
        };

        return board;
    }
}
