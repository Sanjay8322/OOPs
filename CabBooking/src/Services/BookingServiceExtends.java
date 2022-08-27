package Services;

import Classes.Booking;
import Classes.Driver;
import Classes.Location;
import Dao.DriverDao;
import Exceptions.DriverAlreadyExist;
import Exceptions.NoBookingAvailable;

public class BookingServiceExtends implements BookingServices{

    Booking booking;
    Location location;
    DriverDao driverDao;
    public BookingServiceExtends(){
        driverDao=new DriverDao();
        booking=new Booking();
        location=new Location();
    }

    @Override
    public void addDrivers(Driver driver) throws DriverAlreadyExist {
        driverDao.addDriver(driver);
    }

    @Override
    public void bookCab(Location location,String cabType) throws NoBookingAvailable{
        if(location.isCabAvailableForLocation(location.getDrop()) && driverDao.isDriverAvailable() ){
            booking.bookCab(cabType);
        }
        else {
            throw new NoBookingAvailable("No booking available currently!");
        }
    }

    @Override
    public void showCabs() {
        booking.getAvailableCabs();
    }

    @Override
    public void getBookingStatus() {
        booking.getStatus();
    }
}
