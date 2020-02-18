package coordinate.domain.figure;

import coordinate.domain.Point;
import java.util.List;

public enum FigureCreator {
    LINE_CREATOR {
        @Override
        Figure create(List<Point> points) {
            return new Line(points);
        }
    },
    TRIANGLE_CREATOR {
        @Override
        Figure create(List<Point> points) {
            return new Triangle(points);
        }

    },
    RECTANGLE_CREATOR {
        @Override
        Figure create(List<Point> points) {
            return new Rectangle(points);
        }
    };

    abstract Figure create(List<Point> points);
}
