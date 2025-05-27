package DecoratorDesignPattern.topplingDecorator;

import DecoratorDesignPattern.BasePizza;

public class MushroomToppling extends TopplingDecorator {
    public MushroomToppling(BasePizza pizza) {
        super(pizza);
    }
    @Override
    public int pizzaCost() {
        return basePizza.pizzaCost()+40;
    }

    @Override
    public void getDescription() {
        System.out.println("pizza with mushroom toppling");
    }
}
