package Dao;

import Classes.Book;
import Exceptions.BookAlreadyExist;
import Exceptions.BookNotExist;

import java.util.HashMap;
import java.util.Map;

public class Library {
    Book book;
    Map<String,Book> libraryMap;

    public Library(){
        this.book=new Book();
        this.libraryMap=new HashMap<>();
    }

    public void addBook(Book book) throws BookAlreadyExist{
        if(libraryMap.containsKey(book.getBookName())){
            throw new BookAlreadyExist("This book already present in library!");
        }
        libraryMap.put(book.getBookName(),book);
    }

    public void removeBook(String bookName) throws BookNotExist{
        if(libraryMap.containsKey(bookName)){
            libraryMap.remove(bookName);
        }
        else{
            throw new BookNotExist("This is not in Library!");
        }
    }

    public void getGenres(){
        for(Map.Entry<String,Book> mp:libraryMap.entrySet()){
            System.out.println(mp.getValue().getGenre());
        }
    }

    public boolean isAvailable(String bookName){
        return libraryMap.containsKey(bookName);
    }

    public void getBooks(){
        for(Map.Entry<String,Book> mp:libraryMap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue().getGenre()+" "+mp.getValue().getAuthor());
        }
    }
}
