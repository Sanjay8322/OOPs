package Services;

import Classes.Book;
import Exceptions.BookAlreadyExist;
import Exceptions.BookNotExist;

public interface LibraryService {
    void addBook(Book book) throws BookAlreadyExist;
    void removeBook(String bookName) throws BookNotExist;
    void getGenres();
    void getAvailableBooks();
    boolean isBookAvailable(String bookName);
}
