package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookSelf {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> iterator() {
        return new BookListIterator(books);
    }
}
