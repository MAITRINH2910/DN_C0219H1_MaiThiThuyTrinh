import Shape.Shape;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Square;

import colorable.Colorable;

public class ColorableSquareTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle();
        shapes[1] = new Square();
        shapes[2] = new Circle();
        shapes[3] = new Rectangle(3, 5);
        shapes[4] = new Square(2);

        for (Shape shape : shapes) {
            shape.getArea();

            if (shape instanceof Square) {
                Colorable color = (Square) shape;
                color.howToColor();
            }
        }
    }
}
