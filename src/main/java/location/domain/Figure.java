package location.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure implements Calculator {
    private final String DUPLICATE_MSG = "위치가 같은 점(point)이 존재합니다.";
    private final double MAX = Double.MAX_VALUE;
    Points points;

    public Figure(Points points) {
        checkValid(points.getPoints());
        this.points = points;
    }

    private void checkValid(final List<Point> points) {
        isSamePoint(points);
    }

    private void isSamePoint(final List<Point> points) {
        Set<Point> notDuplicatePoints = new HashSet<>();
        for (Point point : points) {
            notDuplicatePoints.add(point);
        }
        if (notDuplicatePoints.size() != points.size()) {
            throw new IllegalArgumentException(DUPLICATE_MSG);
        }
    }

    public abstract Points getPoints();
}
