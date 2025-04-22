package ch04.pizzaaf.factory;

import ch04.pizzaaf.cheese.Cheese;
import ch04.pizzaaf.cheese.ReggianoCheese;
import ch04.pizzaaf.clam.Clams;
import ch04.pizzaaf.clam.FreshClams;
import ch04.pizzaaf.dough.ThinCrustDough;
import ch04.pizzaaf.pepperoni.Pepperoni;
import ch04.pizzaaf.pepperoni.SlicedPepperoni;
import ch04.pizzaaf.sauce.MarinaraSauce;
import ch04.pizzaaf.sauce.Sauce;
import ch04.pizzaaf.dough.Dough;
import ch04.pizzaaf.topping.Garlic;
import ch04.pizzaaf.topping.Mushroom;
import ch04.pizzaaf.topping.Onion;
import ch04.pizzaaf.topping.RedPepper;
import ch04.pizzaaf.topping.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic() , new Onion(), new Mushroom(), new RedPepper()};
        return  veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
