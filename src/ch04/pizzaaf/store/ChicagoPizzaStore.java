package ch04.pizzaaf.store;

import ch04.pizzaaf.factory.ChicagoPizzaIngredientFactory;
import ch04.pizzaaf.factory.PizzaIngredientFactory;
import ch04.pizzaaf.pizza.CheesePizza;
import ch04.pizzaaf.pizza.ClamPizza;
import ch04.pizzaaf.pizza.Pizza;
import ch04.pizzaaf.pizza.VeggiePizza;
import ch04.pizzaaf.pizza.PepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
