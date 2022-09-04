package Services;

import Classes.BookFlight;
import Classes.Flight;
import Dao.BookingDao;
import Dao.FlightDao;

public class AdminServiceImplements implements AdminService{

    FlightDao flightDao;
    BookingDao bookingDao;
    public AdminServiceImplements(){
        this.bookingDao=new BookingDao();
        this.flightDao=new FlightDao();
    }
    @Override
    public void addFlight(Flight flight) {
        flightDao.add(flight);
    }

    @Override
    public void removeFlight(String name) {
        flightDao.remove(name);
    }

    @Override
    public void BookCustomer(int id, BookFlight bookFlight) {
        bookingDao.addBooking(id,bookFlight);
    }

    @Override
    public void CancelBooking(int id) {
        bookingDao.cancelBooking(id);
    }

    @Override
    public void showAllBooking() {
        bookingDao.all();
    }
}
