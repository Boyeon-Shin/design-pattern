package decorator.ex2;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new veggieMania();

        pizza= new cheeseTopping(pizza);
        pizza= new tomatoTopping(pizza);

        System.out.println(pizza.getPrice());

    }
}
