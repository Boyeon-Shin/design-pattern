package ch001;

public class MallardDuck extends Duck {
    // 오리의 행동 형식을 생성자에서 인스턴스를 만들기
    public MallardDuck() {
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWing();
    }

    public void display() {
        System.out.println("난 물오리입니다만");
    }
}
