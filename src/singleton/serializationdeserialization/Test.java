package singleton.serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();

        // 직렬화
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser"));
        out.writeObject(s1);
        out.close();

        // 역직렬화
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.ser"));
        Singleton s2 = (Singleton) in.readObject();
        in.close();

        System.out.println(s1 == s2); // false! 또 다른 인스턴스
    }
}