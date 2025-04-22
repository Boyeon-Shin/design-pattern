package ch04.pizzaaf.store;

import ch04.pizzaaf.factory.NYPizzaIngredientFactory;
import ch04.pizzaaf.factory.PizzaIngredientFactory;
import ch04.pizzaaf.pizza.CheesePizza;
import ch04.pizzaaf.pizza.ClamPizza;
import ch04.pizzaaf.pizza.PepperoniPizza;
import ch04.pizzaaf.pizza.Pizza;
import ch04.pizzaaf.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
