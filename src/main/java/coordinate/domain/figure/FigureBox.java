package coordinate.domain.figure;

public enum FigureBox {
    LINE {
        @Override
        int size() {
            return 2;
        }

        @Override
        FigureCreator createCreator(){
            return FigureCreator.LINE_CREATOR;
        }

    },
    TRIANGLE {
        @Override
        int size() {
            return 3;
        }

        @Override
        FigureCreator createCreator(){
            return FigureCreator.TRIANGLE_CREATOR;
        }

    },
    RECTANGLE {
        @Override
        int size() {
            return 4;
        }

        @Override
        FigureCreator createCreator(){
            return FigureCreator.RECTANGLE_CREATOR;
        }

    };

    abstract int size();

    abstract FigureCreator createCreator();

}
