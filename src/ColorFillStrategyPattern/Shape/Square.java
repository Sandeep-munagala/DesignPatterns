package ColorFillStrategyPattern.Shape;

import ColorFillStrategyPattern.ColorStyles.ColorStyles;

public class Square extends Shape {

    public Square(ColorStyles colorStyle) {
        super(colorStyle);
    }

    @Override
    public void getDesc() {
        System.out.println("this is a square and filled with " + colorStyle.fill());

    }
}
