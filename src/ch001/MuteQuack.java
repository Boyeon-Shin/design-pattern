package ch001;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< 조용 ~ >>");
    }
}
