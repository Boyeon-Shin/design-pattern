package ch04.pizzaframe;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(final String item) {
        if (item.equals("cheese")) {
            return new CaliforniaCheesePizza();
        } else if (item.equals("veggie")) {
            return new CaliforniaVeggiePizza();
        } else if (item.equals("clam")) {
            return new CaliforniaClamPizza();
        } else if (item.equals("pepperoni")) {
            return new CaliforniaPepperoniPizza();
        } else {
            return null;
        }
    }
}
