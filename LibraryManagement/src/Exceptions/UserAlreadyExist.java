package Exceptions;

public class UserAlreadyExist extends Exception{
    public UserAlreadyExist(String err){
        super(err);
    }
}
