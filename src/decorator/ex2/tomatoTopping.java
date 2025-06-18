package decorator.ex2;

public class tomatoTopping extends Topping{

    public tomatoTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 10;
    }
}
