import Board.*;
import Pieces.Pawn;
import Pieces.Piece;
import Pieces.PieceColor;
import Pieces.Queen;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        Piece pawn = new Pawn(PieceColor.WHITE);
        Piece queen = new Queen(PieceColor.WHITE);
        b.getBoard()[1][3] = null;
        Point origin = new Point(3, 0);
        Point dest = new Point(3, 5);
        Move move = new Move(origin, dest, queen);
        b.printBoard();
        System.out.println("--------------");
        move.execute(b);
        b.printBoard();
    }
}
