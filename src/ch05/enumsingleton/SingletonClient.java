package ch05.enumsingleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.UNIQUE_INSTANCE;
        Singleton singleton2 = Singleton.UNIQUE_INSTANCE;

        singleton1.fill();
        singleton2.fill();
        singleton2.drain();

        System.out.println(singleton1 == singleton2);
    }
}
