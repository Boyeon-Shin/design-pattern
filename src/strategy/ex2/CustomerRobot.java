package strategy.ex2;

public class CustomerRobot {
    public static void main(String[] args) {
        Robot robot = new Robot("걷기 로봇", new Walk(), new Korean());

        robot.display();
        robot.move();
        robot.translate();

        System.out.println();
        robot.setName("뛰기 로봇");
        robot.setMove(new Run());
        robot.setTranslate(new Japanese());

        robot.display();
        robot.move();
        robot.translate();
    }
}
