package ch08.simplebarista;

public class Tea {
    
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("물 끓이는 중");
    }

    private void brewCoffeeGrinds() {
        System.out.println("찻잎을 우려내는 중");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    private void addLemon() {
        System.out.println("레몬을 추가하는 중");
    }
}
