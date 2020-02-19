package coordinate.domain.figure;

import java.util.List;
import coordinate.domain.Point;

public enum FigureBox {
    LINE {
        @Override
        int size() {
            return 2;
        }

        @Override
        Figure create(List< Point > points) {
            return new Line(points);
        }

    },
    TRIANGLE {
        @Override
        int size() {
            return 3;
        }

        @Override
        Figure create(List<Point> points) {
            return new Triangle(points);
        }

    },
    RECTANGLE {
        @Override
        int size() {
            return 4;
        }

        @Override
        Figure create(List<Point> points) {
            return new Rectangle(points);
        }

    };

    abstract int size();

    abstract Figure create(List<Point> points);
}
