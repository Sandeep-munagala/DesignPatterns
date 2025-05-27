package DecoratorDesignPattern.topplingDecorator;

import DecoratorDesignPattern.BasePizza;

public class ExtraCheeseToppling extends TopplingDecorator {

    public ExtraCheeseToppling(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public int pizzaCost() {
        return basePizza.pizzaCost()+20;
    }

    @Override
    public void getDescription() {
        System.out.println("this is pizza toppling extra cheese");
    }
}
