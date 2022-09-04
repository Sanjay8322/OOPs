package Dao;

import Classes.BookFlight;
import Enums.BookingStatus;

import java.util.HashMap;
import java.util.Map;

public class BookingDao {
    BookFlight bookFlight;
    Map<Integer, BookFlight> bookMap;

    public BookingDao(){
        bookFlight=new BookFlight();
        bookMap=new HashMap<>();
    }

    public void addBooking(int id,BookFlight bookFlight){
        bookMap.put(id,bookFlight);
        bookFlight.setStatus(BookingStatus.Booked);
    }

    public void cancelBooking(int id){
        bookMap.remove(id);
        bookFlight.setStatus(BookingStatus.Cancelled);
    }

    public void all(){
        for(Map.Entry<Integer,BookFlight> mp:bookMap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue().getFlightName()+" "+mp.getValue().getCustomerName());
        }
    }

}
