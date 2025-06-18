package mediator.ex2;

public class SmartHome implements Mediator {
    private Component airConditioner;
    private Component door;
    private double temperature;

    public void setComponent(Component component) {
        if (component instanceof AirConditioner) {
            airConditioner = (AirConditioner) component;
        } else if (component instanceof Door) {
            door = (Door) component;
        }
    }

    public void setTemperature(final double temperature) {
        this.temperature = temperature;
        control(temperature);
    }

    private void control(double temperature) {
        if(temperature > 25) {
            ControlConditioner(true);
            ControlDoor(false);
        } else if(temperature < 18) {
            ControlConditioner(false);
            ControlDoor(true);
        } else {
            ControlConditioner(false);
            ControlDoor(false);
        }
    }

    @Override
    public void ControlConditioner(Boolean b) {
       airConditioner.operation(b);
    }

    @Override
    public void ControlDoor(Boolean b) {
        door.operation(b);
    }
}
