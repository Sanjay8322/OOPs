package Exceptions;

public class CustomerNotExist extends Exception{
    public CustomerNotExist(String err){
        super(err);
    }
}
