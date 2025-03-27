package ch02.simple;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    public SimpleObserver(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(final int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("value: " + value);
    }
}
