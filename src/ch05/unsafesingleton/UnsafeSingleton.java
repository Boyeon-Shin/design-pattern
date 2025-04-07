package ch05.unsafesingleton;

public class UnsafeSingleton {
    private static UnsafeSingleton instance;

    private UnsafeSingleton() {
        System.out.println("생성자 호출됨! 인스턴스 생성!");
    }

    public static UnsafeSingleton getInstance() {
        if (instance == null) {
            try {
                // 일부러 약간 지연!
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new UnsafeSingleton();
        }
        return instance;
    }
}