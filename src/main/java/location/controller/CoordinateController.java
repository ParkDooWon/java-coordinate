package location.controller;

import location.domain.Points;
import location.domain.Shape;
import location.domain.ShapeMaker;
import location.view.InputView;
import location.view.OutputView;
import location.view.ShapeMsgEnum;

public class CoordinateController {

    public static void main(String[] args) {
        Points points = new Points(InputView.inputCoordinate());
        Shape shape = ShapeMaker.create(points);
        OutputView outputView = new OutputView(points.size(), shape.calculate());
        outputView.printResultMap(points);
        outputView.printResultText();
    }
}
