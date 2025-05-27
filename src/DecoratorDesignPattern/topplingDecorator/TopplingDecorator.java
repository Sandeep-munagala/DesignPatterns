package DecoratorDesignPattern.topplingDecorator;

import DecoratorDesignPattern.BasePizza;

public abstract class TopplingDecorator implements BasePizza {
    BasePizza basePizza;

    TopplingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
