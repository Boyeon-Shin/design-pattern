package factoryMethod;

public abstract class GunStore {
    abstract IGun findGun();

    public void getGun() {
        IGun gun = findGun();
        System.out.println(gun.getName());
        System.out.println(gun.getPower());
    }
}
