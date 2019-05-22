package location.controller;

import location.domain.Points;
import location.domain.Shape;
import location.domain.ShapeMaker;
import location.view.InputView;

public class CoordinateController {

    public static void main(String[] args) {
        Points points = new Points(InputView.inputCoordinate());
        Shape shape = ShapeMaker.create(points);
        System.out.println(shape.calculate());
    }
}
