package ch05.unsafesingleton;

public class SingletonTest {
    public static void main(String[] args) {
        Runnable task = () -> {
            UnsafeSingleton instance = UnsafeSingleton.getInstance();
            System.out.println("인스턴스 주소: " + instance);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}