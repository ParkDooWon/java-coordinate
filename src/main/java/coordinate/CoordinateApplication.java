package coordinate;

import coordinate.domain.figure.Figure;
import coordinate.domain.figure.FigureFactory;
import coordinate.domain.Point;
import coordinate.utils.PointParser;
import coordinate.view.InputView;

import java.util.List;

public class CoordinateApplication {
    public static void main(String[] args) {
        String value = InputView.getPoint();
        try {
            List<Point> points = PointParser.parse(value);
            Figure result = FigureFactory.getFigure(points);
            System.out.println(result.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}