package ch05;

public class Singleton {
    //하나뿐인 인스턴스를 저장하는 정적 변수
    private static Singleton uniqueInstance;

    //기타 인스턴스 변수

    //생성자를 private으로 선언했으므로 Singleton에서만 클래스의 인스턴스를 만들 수 있음
    private Singleton() {
    }

    //getInstance() 메소드는 클래스의 인스턴스를 만들어서 리턴함
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //기타 메소드 (싱글톤도 보통의 클래스..)
}