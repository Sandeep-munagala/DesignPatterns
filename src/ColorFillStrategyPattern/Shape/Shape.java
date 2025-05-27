package ColorFillStrategyPattern.Shape;

import ColorFillStrategyPattern.ColorStyles.ColorStyles;

public abstract class Shape {
    ColorStyles colorStyle;

    Shape(ColorStyles colorStyle) {
        this.colorStyle = colorStyle;
    }
    public abstract void getDesc();
}
