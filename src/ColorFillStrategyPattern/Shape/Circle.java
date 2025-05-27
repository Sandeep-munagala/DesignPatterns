package ColorFillStrategyPattern.Shape;

import ColorFillStrategyPattern.ColorStyles.ColorStyles;

public class Circle extends Shape {

    public Circle(ColorStyles colorStyle) {
        super(colorStyle);
    }

    @Override
    public void getDesc() {
        System.out.println("this is a circle and filled with " + colorStyle.fill());
    }
}
