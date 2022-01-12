package ResizeableShape;

import com.codegym.Square;

public class ResizableSquare extends Square implements Resizable {

    public ResizableSquare() {
    }

    public ResizableSquare(double side) {
        super(side);
    }

    public ResizableSquare(String color, boolean filled, double side) {
        super(color, filled, side);
    }

    @Override
    public void resize(double percent) {
        double scale = percent / 100;
        setSide(getSide() * scale);
    }
}
