package coordinate.domain;

import coordinate.utils.InvalidPositionException;

public class Dot {
    private int dot;
    Dot(int dot) {
        if (dot < 0 || dot > 24) {
            throw new InvalidPositionException("유효하지않은 범위입니다.");
        }
        this.dot = dot;
    }

    public int getDot() {
        return this.dot;
    }
}
