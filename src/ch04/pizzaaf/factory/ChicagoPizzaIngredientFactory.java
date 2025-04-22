package ch04.pizzaaf.factory;

import ch04.pizzaaf.cheese.Cheese;
import ch04.pizzaaf.cheese.MozzarellaCheese;
import ch04.pizzaaf.clam.Clams;
import ch04.pizzaaf.clam.FrozenClams;
import ch04.pizzaaf.dough.ThickCrustDough;
import ch04.pizzaaf.pepperoni.Pepperoni;
import ch04.pizzaaf.pepperoni.SlicedPepperoni;
import ch04.pizzaaf.sauce.PlumTomatoSauce;
import ch04.pizzaaf.sauce.Sauce;
import ch04.pizzaaf.dough.Dough;
import ch04.pizzaaf.topping.BlackOlives;
import ch04.pizzaaf.topping.Eggplant;
import ch04.pizzaaf.topping.Spinach;
import ch04.pizzaaf.topping.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives() , new Spinach(), new Eggplant()};
        return  veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
