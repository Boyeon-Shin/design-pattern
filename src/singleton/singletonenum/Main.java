package singleton.singletonenum;

public class Main {
    public static void main(String[] args) {
        // 싱글톤을 통해 클라이언트 객체를 가져와 연결
        Client client = SingletonEnum.INSTANCE.getClient();
        client.connect(); // 결과: "DB에 연결되었습니다."

        Client client2 = SingletonEnum.INSTANCE.getClient();

        System.out.println(SingletonEnum.INSTANCE);
        System.out.println(client == client2);
    }
}
