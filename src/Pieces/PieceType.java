package Pieces;

public enum PieceType {
    PAWN("P"),
    KNIGHT("N"),
    BISHOP("B"),
    ROOK("R"),
    QUEEN("Q"),
    KING("K");

    private String notationName;

    PieceType(String notationName) {
        this.notationName = notationName;
    }

    public String notationName() {
        return notationName;
    }
}
