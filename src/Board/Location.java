package Board;

public class Location {
    private int col;
    private int row;

    public Location(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int col() {
        return this.col;
    }

    public int row() {
        return this.row;
    }

    @Override
    public String toString() {
        return "" + (char) ('a' + this.col()) + (this.row() + 1);
    }
}
