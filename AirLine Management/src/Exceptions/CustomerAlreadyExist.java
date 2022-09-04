package Exceptions;

public class CustomerAlreadyExist extends Exception{
    public CustomerAlreadyExist(String err){
        super(err);
    }
}
