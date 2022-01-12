package ResizeableShape;

import com.codegym.Rectangle;

public class ResizableRectangle extends Rectangle implements Resizable {
    public ResizableRectangle() {
    }

    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizableRectangle(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void resize(double percent) {
        double scale = percent/100;
        setWidth(getWidth()*scale);
        setLength(getWidth()*scale);
    }
}
