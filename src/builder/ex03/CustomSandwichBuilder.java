package builder.ex03;

import builder.director.Builder;
import java.util.ArrayList;
import java.util.List;

public class CustomSandwichBuilder implements SandwichBuilder{
    private String bread;
    private String meat;
    private String cheese;
    private List<String> vegetable = new ArrayList<>();
    private List<String> sauce = new ArrayList<>();

    @Override
    public CustomSandwichBuilder setBread(final String bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public CustomSandwichBuilder setMeat(final String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public CustomSandwichBuilder setCheese(final String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public CustomSandwichBuilder addVegetable(String vegetable) {
        this.vegetable.add(vegetable);
        return this;
    }

    @Override
    public CustomSandwichBuilder addSauce(String sauce) {
        this.sauce.add(sauce);
        return this;
    }

    public Sandwich build() {
        Sandwich sandwich = new Sandwich(bread, meat, cheese, vegetable, sauce);
        return sandwich;
    }
}
