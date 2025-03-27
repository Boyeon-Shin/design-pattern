package ch02.simpleObervable;

import java.util.Observable;
import java.util.Observer;

public class SimpleSubject extends Observable {
    private int value;

    public SimpleSubject() {
    }

    public void setVale(int value) {
        this.value = value;
        setChanged();
        notifyObservers(value);
    }

    public int getValue() {
        return this.value;
    }
}
