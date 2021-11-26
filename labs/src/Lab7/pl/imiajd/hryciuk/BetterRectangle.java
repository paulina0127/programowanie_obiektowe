package pl.imiajd.hryciuk;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int height, int width, int x, int y) {
        super.setSize(height, width);
        super.setLocation(x, y);
    }

    public int getPerimeter() {
        return (height + width) * 2;
    }

    public int getArea() {
        return height * width;
    }
}
