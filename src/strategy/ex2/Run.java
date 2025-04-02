package strategy.ex2;

public class Run implements MoveStrategy {

    @Override
    public void move() {
        System.out.println("뛰어서 배달합니다.");
    }
}
