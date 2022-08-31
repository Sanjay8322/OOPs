package Services;

import Classes.Book;
import Dao.Library;
import Exceptions.BookAlreadyExist;
import Exceptions.BookNotExist;

public class LibraryServiceImplements implements LibraryService{

    Library library;
    public LibraryServiceImplements(){
        this.library=new Library();
    }
    @Override
    public void addBook(Book book) throws BookAlreadyExist {
        library.addBook(book);
        System.out.println("Book added in Library");
    }

    @Override
    public void removeBook(String bookName) throws BookNotExist {
        library.removeBook(bookName);
        System.out.println("Book removed from library");
    }

    @Override
    public void getGenres() {
        library.getGenres();
    }

    @Override
    public void getAvailableBooks() {
        library.getBooks();
    }

    @Override
    public boolean isBookAvailable(String bookName) {
        return library.isAvailable(bookName);
    }
}
