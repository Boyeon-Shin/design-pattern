package ch05.safesingleton;

public class DCLSingleton {
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton() {
        System.out.println("생성자 호출됨! 인스턴스 생성!");
    }

    public static DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}