package mediator.ex2;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new SmartHome();

        mediator.setComponent(new AirConditioner());
        mediator.setComponent(new Door());

        mediator.setTemperature(39);
        System.out.println();
        mediator.setTemperature(10);
        System.out.println();
        mediator.setTemperature(19);
    }
}
