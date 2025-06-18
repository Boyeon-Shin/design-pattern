package mediator.ex2;

public interface Mediator {
    void setComponent(Component component);
    void setTemperature(double temperature);
    void ControlConditioner(Boolean b);
    void ControlDoor(Boolean b);
}
