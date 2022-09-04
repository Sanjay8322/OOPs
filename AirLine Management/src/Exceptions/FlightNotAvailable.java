package Exceptions;

public class FlightNotAvailable extends Exception{
    public FlightNotAvailable(String err){
        super(err);
    }
}
