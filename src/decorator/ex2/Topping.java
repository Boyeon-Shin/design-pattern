package decorator.ex2;

public abstract class Topping implements Pizza{
    Pizza pizza;

    public abstract int getPrice();
}
