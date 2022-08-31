package Exceptions;

public class BookAlreadyExist extends Exception{
    public BookAlreadyExist(String err){
        super(err);
    }
}
