package ch001;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWing();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
