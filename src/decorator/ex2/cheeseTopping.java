package decorator.ex2;

public class cheeseTopping extends Topping {

    public cheeseTopping(Pizza pizza) {
       this.pizza = pizza;
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }

}
