package iterator;

import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf();

        bookSelf.addBook(new Book("보연"));
        bookSelf.addBook(new Book("사춘기"));
        bookSelf.addBook(new Book("누가 내머리에 똥쌋어"));

        printBook(bookSelf.iterator());
    }

    public static void printBook(Iterator<Book> iterator) {
        Iterator<Book> bookIterator = iterator;

        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println(book.getTitle());
        }

    }
}
