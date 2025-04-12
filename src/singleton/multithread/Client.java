package singleton.multithread;

import singleton.singlethread.Singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println("같은 값이 보이면, 싱글톤을 재사용했습니다(yay!). " + "\n" +
                "만약 다른 값이 보인다면, 두 개의 싱글톤이 생성된 것 입니다.(booo!!)" + "\n\n" +
                "RESULT: " + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
