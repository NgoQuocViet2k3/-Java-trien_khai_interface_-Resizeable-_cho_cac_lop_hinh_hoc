package ResizeableShape;

import com.codegym.Circle;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {

    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        double scale = percent/100;
        setRadius(getRadius()*scale);
    }
}
