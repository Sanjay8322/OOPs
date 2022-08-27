package Services;

import Classes.Driver;
import Classes.Location;
import Exceptions.DriverAlreadyExist;
import Exceptions.NoBookingAvailable;

public interface BookingServices {
    void addDrivers(Driver driver) throws DriverAlreadyExist;
    void bookCab(Location location,String cabType) throws NoBookingAvailable;
    void showCabs();
    void getBookingStatus();
}
