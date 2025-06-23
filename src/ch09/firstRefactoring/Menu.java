package ch09.firstRefactoring;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
