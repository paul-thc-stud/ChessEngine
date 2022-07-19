package Board;

public enum Directions {
    RIGHT_DOWN(new Point(1, 1)),
    RIGHT_UP(new Point(1, -1)),
    LEFT_UP(new Point(-1, -1)),
    LEFT_DOWN(new Point(-1, 1));

    private Point direction;

    Directions(Point direction) {
        this.direction = direction;
    }

    public Point direction() {
        return this.direction;
    }
}
