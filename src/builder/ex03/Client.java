package builder.ex03;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = new CustomSandwichBuilder()
                .setBread("허니오트")
                .setMeat("치킨")
                .setCheese("슈레드")
                .addVegetable("양상추")
                .addVegetable("양상추")
                .addSauce("마요네즈")
                .build();

        sandwich.print();


        SubPick pick = new SubPick(new CustomSandwichBuilder());
        Sandwich sw = pick.makeSandwich();
        sw.print();
    }
}
