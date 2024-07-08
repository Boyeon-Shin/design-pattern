package ch01;

public abstract class Duck {
    // 행동 변수는 행동 인스턴스형식으로 선언
    // 모든 Duck 에는 QuackBehavior 인터페이스를 구현하는 것의 레퍼런스가 있음
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    // 꽥꽥 거리는 행동을 직접 처리하는 대신, quackBehavior로 참조되는 객체에 그 행동을 위임
    public void performQuack() {
        quackBehavior.quack();
    };
    public void performFly() {
        flyBehavior.fly();
    };

    // 동적으로 만든거 활용하기



    public void swim() {
        System.out.println("모든 오리는 물에 떠요, 가짜오리도요");
    }

}
