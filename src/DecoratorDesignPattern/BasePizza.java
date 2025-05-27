package DecoratorDesignPattern;

public interface BasePizza {
    public default void getDescription() {
        System.out.println("Pizza Description");
    }

    public abstract int pizzaCost();
}
