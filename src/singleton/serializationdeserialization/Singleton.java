package singleton.serializationdeserialization;

import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {}

    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
