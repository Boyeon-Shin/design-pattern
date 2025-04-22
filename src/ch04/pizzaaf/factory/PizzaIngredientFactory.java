package ch04.pizzaaf.factory;

import ch04.pizzaaf.cheese.Cheese;
import ch04.pizzaaf.clam.Clams;
import ch04.pizzaaf.pepperoni.Pepperoni;
import ch04.pizzaaf.sauce.Sauce;
import ch04.pizzaaf.dough.Dough;
import ch04.pizzaaf.topping.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
