package factoryMethod;

public class AKFind extends GunStore{
    @Override
    IGun findGun() {
        return new AK47();
    }
}

