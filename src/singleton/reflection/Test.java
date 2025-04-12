package singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();

//        Field field = Singleton.class.getDeclaredField("s");
//        field.setAccessible(true);
//        String s = (String) field.get(s1);
//        System.out.println("원래값:" + s);
//
//        field.set(s1, "난 악마");
//        System.out.println("비뀐값: " + field.get(s1));

        constructor.setAccessible(true);
        Singleton s2 = constructor.newInstance();

        System.out.println(s1 == s2);

        Constructor<Singleton2> constructor2 = Singleton2.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton2 newInstance2 = constructor2.newInstance(); // 새로운 객체 생성됨!
        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton2 == newInstance2);
    }
}
