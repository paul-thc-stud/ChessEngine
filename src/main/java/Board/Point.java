package Board;

public class Point {
    private int col;
    private int row;

    public Point(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public Point(Point point) {
        this(point.col, point.row);
    }

    public int col() {
        return this.col;
    }

    public int row() {
        return this.row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void addRow(int rowsToAdd) {
        this.setRow(this.row() + rowsToAdd);
    }

    public void addCol(int colsToAdd) {
        this.setCol(this.col() + colsToAdd);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return col == point.col &&
                row == point.row;
    }

    @Override
    public String toString() {
        return "" + (char) ('a' + this.col()) + (this.row() + 1);
    }
}
