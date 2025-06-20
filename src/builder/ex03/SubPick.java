package builder.ex03;

public class SubPick {
    private SandwichBuilder sandwichBuilder;

    public SubPick(final SandwichBuilder customSandwichBuilder) {
        this.sandwichBuilder = customSandwichBuilder;
    }

    public Sandwich makeSandwich() {
        return sandwichBuilder.setBread("오트")
                .setMeat("소고기")
                .setCheese("노란치즈")
                .addVegetable("피클")
                .addSauce("몰라몰라 소스")
                .addSauce("칠리")
                .build();
    }
}
