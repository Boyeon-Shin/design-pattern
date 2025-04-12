package singleton.reflection;

public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {
        // 생성자 막기
        if (instance != null) {
            throw new RuntimeException("이미 생성된 인스턴스가 있습니다.");
        }
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}