package ch04.pizzaframe;

public class CaliforniaCheesePizza extends Pizza {
    public CaliforniaCheesePizza () {
        name = "캘리포니아 피자";
        dough = "흑미 도우";
        sauce = "토마토 소스";

        toppings.add("오징어 토핑");
        toppings.add("조개 토핑");
    }
}
