package builder.ex03;

public interface SandwichBuilder {
    SandwichBuilder setBread(String bread);
    SandwichBuilder setMeat(String meat);
    SandwichBuilder setCheese(String cheese);
    SandwichBuilder addVegetable(String veggies);
    SandwichBuilder addSauce(String sauce);
    Sandwich build();
}
