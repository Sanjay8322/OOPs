package Exceptions;

public class NoBookingAvailable extends Exception{
    public NoBookingAvailable(String err){
        super(err);
    }
}
