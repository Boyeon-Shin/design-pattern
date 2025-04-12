package singleton.singletonenum;

// Database.java
public class Database {
    public static Client getClient() {
        System.out.println("Client 인스턴스를 생성합니다.");
        return new Client();
    }
}