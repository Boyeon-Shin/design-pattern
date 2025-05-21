package ch08.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n홍차 준비중...");
        teaHook.prepareRecipe();

        System.out.println("\n커피 준비중...");
        coffeeHook.prepareRecipe();
    }
}
