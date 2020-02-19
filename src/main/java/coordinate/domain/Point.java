package coordinate.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Point {
    private final Dot x;
    private final Dot y;
    private static final Map<Integer, Dot> dots = new HashMap<>();
    static {
        for (int i = 1; i <= 24; i++) {
            dots.put(i, new Dot(i));
        }
    }

    private Point(int x, int y) {
        this.x = dots.get(x);
        this.y = dots.get(y);
    }

    public double getDistance(Point other) {
        int xDifference = other.minusX(x);
        int yDifference = other.minusY(y);
        return Math.sqrt(square(xDifference) + square(yDifference));
    }

    private int minusX(Dot number) {
        return this.x.getDot() - number.getDot();
    }

    private int minusY(Dot number) {
        return this.y.getDot() - number.getDot();
    }

    private static int square(int number) {
        return number * number;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }
}
