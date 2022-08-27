package Classes;

import Dao.CustomerDao;
import Dao.DriverDao;
import Exceptions.CustomerAlreadyExist;
import Exceptions.DriverAlreadyExist;
import Exceptions.NoBookingAvailable;
import Services.BookingServiceExtends;
import Services.CustomerServiceExtends;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomerAlreadyExist, DriverAlreadyExist, NoBookingAvailable {
        Customer customer1=new Customer("Sanjay",21,"male",1);
        Customer customer2=new Customer("Josephine",22,"female",2);

        Driver driver1=new Driver("Ram",32,"male",1);
        Driver driver2=new Driver("Ganesh",34,"male",2);

        CustomerDao customerDao=new CustomerDao();
        customerDao.addCustomer(customer1);
        customerDao.addCustomer(customer2);

        DriverDao driverDao=new DriverDao();
        driverDao.addDriver(driver1);
        driverDao.addDriver(driver2);


        CustomerServiceExtends customerService=new CustomerServiceExtends();
        BookingServiceExtends bookingService=new BookingServiceExtends();

        customerService.registerCustomer(customer1);
        customerService.registerCustomer(customer2);
        bookingService.addDrivers(driver1); //// Only adding in DAO remains not enough .
        bookingService.addDrivers(driver2);

        Booking booking=new Booking();
        booking.setAvailableCabs(CabList());
        booking.getAvailableCabs();

        Location location=new Location("Chennai",40);

//        bookingService.getBookingStatus();
        bookingService.bookCab(location,"mini");
        bookingService.getBookingStatus();




    }

    public static List<String>CabList(){
        List<String> cabList=new ArrayList<>();
        cabList.add("sedan");
        cabList.add("mini");
        cabList.add("auto");
        return cabList;
    }
}
