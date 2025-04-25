package factoryMethod;

public class Client {
    public static void main(String[] args) {
        GunStore akStore = new AKFind();
        GunStore musketStore = new MusketFind();

        akStore.getGun();
        musketStore.getGun();
    }
}
