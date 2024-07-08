package ch01;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        System.out.println("-------1--------");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("-------2--------");
        Duck model = new ModelDuck();
        model.performFly();
        // 동적으로 사용
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
