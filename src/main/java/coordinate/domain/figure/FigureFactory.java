package coordinate.domain.figure;

import coordinate.domain.Point;
import coordinate.utils.InvalidFigureException;

import java.util.Arrays;
import java.util.List;

public class FigureFactory {

    public static Figure getFigure(List<Point> points) {
        FigureBox figureBox = find(points);
        FigureCreator figureCreator = figureBox.createCreator();
        return figureCreator.create(points);
    }

    private static FigureBox find(List<Point> points){
        return Arrays.stream(FigureBox.values())
                .filter(f -> f.size() == points.size())
                .findFirst()
                .orElseThrow(() -> new InvalidFigureException("유효하지 않은 도형입니다."));
    }
}

