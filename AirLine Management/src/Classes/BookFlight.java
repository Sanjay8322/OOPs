package Classes;

import Enums.BookingStatus;
import Enums.SeatType;

public class BookFlight {
    Customer customer;
    Flight flight;
    int noOfSeats;
    SeatType seatType;
    BookingStatus status;

    public BookFlight(){

    }
    public BookFlight(int id,Customer customer, Flight flight, int noOfSeats,SeatType seatType) {
        this.customer = customer;
        this.flight = flight;
        this.noOfSeats = noOfSeats;
        this.seatType=seatType;
        status=BookingStatus.NotBooked;
    }

    public void SetAvailableSeats(int noOfSeats){
        flight.setRemainingSeats(noOfSeats);
    }

    public String getFlightName(){
        return flight.getFlightName();
    }

    public String getCustomerName(){
        return customer.name;
    }
    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public String getSeatType() {
        return seatType.toString();
    }
}
