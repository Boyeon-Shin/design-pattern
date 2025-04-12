package singleton.test;

public class Main {
    public static void main(String[] args) {
        System.out.println(Outer.Holder.value);
        new Outer.Holder();
    }
}