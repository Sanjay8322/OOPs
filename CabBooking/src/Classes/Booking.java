package Classes;

import Enums.BookingStatus;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    List<String> availableCabs;
    BookingStatus status;
    public Booking(){
        status=BookingStatus.NotBooked;
        availableCabs=new ArrayList<>();
    }

    public void setAvailableCabs(List<String> availableCabs) {
        this.availableCabs = availableCabs;
    }

    public void getStatus() {
        System.out.println(status.toString());
    }

    public void getAvailableCabs() {
        for(String s:availableCabs){
            System.out.println(s);
        }
    }

    public boolean isCabsAvailable(){
        return availableCabs.size() != 0;
    }

    public void bookCab(String cabName){
        this.status=BookingStatus.Booked;
        availableCabs.remove(cabName);
    }
}
