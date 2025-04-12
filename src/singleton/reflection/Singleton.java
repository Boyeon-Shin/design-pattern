package singleton.reflection;

public class Singleton {
    private static final String s = "singleton";

    private Singleton() {
//        if(Holder.INSTANCE != null){
//            throw new RuntimeException("리플렉션으로 인스턴스를 생성하려고 함!");
//        }
        System.out.println("생성자 호출됨");
    }

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
