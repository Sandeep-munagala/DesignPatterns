package ColorFillStrategyPattern;

import ColorFillStrategyPattern.ColorStyles.PatternFill;
import ColorFillStrategyPattern.ColorStyles.SolidColor;
import ColorFillStrategyPattern.Shape.Circle;
import ColorFillStrategyPattern.Shape.Shape;
import ColorFillStrategyPattern.Shape.Square;

public class test {
    public static void main(String[] args) {
        Shape shape = new Circle(new PatternFill());
        Shape shape1 = new Square(new SolidColor());

        shape.getDesc();
        shape1.getDesc();
    }
}
