package iterator;

import java.util.Iterator;
import java.util.List;

public class BookListIterator implements Iterator<Book> {
    private Iterator<Book> books;

    public BookListIterator(List<Book> book) {
        this.books = book.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.books.hasNext();
    }

    @Override
    public Book next() {
        return this.books.next();
    }
}

