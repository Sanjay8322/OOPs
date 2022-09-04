package Services;

import Classes.BookFlight;
import Classes.Flight;

public interface AdminService {

    void addFlight(Flight flight);
    void removeFlight(String name);

    void BookCustomer(int id, BookFlight bookFlight);
    void CancelBooking(int id);
    void showAllBooking();

}
