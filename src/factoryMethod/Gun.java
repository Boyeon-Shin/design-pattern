package factoryMethod;

public class Gun implements IGun{
    String name;
    int power;

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void setPower(final int power) {
        this.power = power;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPower() {
        return power;
    }
}
