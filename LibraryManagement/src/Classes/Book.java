package Classes;

public class Book {
    int bookId;
    String bookName;
    String author;
    String genre;

    public Book(){

    }
    public Book(int bookId, String bookName, String author, String genre) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}
