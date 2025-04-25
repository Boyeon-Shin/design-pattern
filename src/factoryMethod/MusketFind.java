package factoryMethod;

public class MusketFind extends GunStore{
    @Override
    IGun findGun() {
        return new Musket();
    }
}

