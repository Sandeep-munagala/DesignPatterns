package DecoratorDesignPattern;

import DecoratorDesignPattern.topplingDecorator.ExtraCheeseToppling;
import DecoratorDesignPattern.topplingDecorator.MushroomToppling;

public class test {
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheeseToppling(new FarmHousePizza());
        System.out.println(pizza.pizzaCost());
        BasePizza pizza2 = new MushroomToppling(new ExtraCheeseToppling(new FarmHousePizza()));
        System.out.println(pizza2.pizzaCost());
    }
}
