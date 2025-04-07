package ch05.safesingleton;

public class SafeSingleton {
    private static SafeSingleton instance;

    private SafeSingleton() {
        System.out.println("생성자 호출됨! 인스턴스 생성!");
    }

    public static synchronized SafeSingleton getInstance() {
        if (instance == null) {
            instance = new SafeSingleton();
        }
        return instance;
    }
}