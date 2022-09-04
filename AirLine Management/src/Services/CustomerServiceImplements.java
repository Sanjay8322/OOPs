package Services;

import Classes.Customer;
import Dao.CustomerDao;
import Dao.FlightDao;
import Exceptions.CustomerAlreadyExist;
import Exceptions.CustomerNotExist;
import Exceptions.FlightNotAvailable;

public class CustomerServiceImplements implements CustomerService{

    FlightDao flightDao;
    CustomerDao customerDao;

    public CustomerServiceImplements(){
        this.customerDao=new CustomerDao();
        this.flightDao=new FlightDao();
    }

    @Override
    public void register(Customer customer) throws CustomerAlreadyExist {
        customerDao.addCustomer(customer);
    }

    @Override
    public void removeAccount(String name) throws CustomerNotExist {
        customerDao.removeCustomer(name);
    }

    @Override
    public void showCustomerDetail() {
        customerDao.getCustomerDetails();
    }

    @Override
    public void searchFlight(String flightName) throws FlightNotAvailable {
        flightDao.search(flightName);
    }

    @Override
    public void showFlightDetails() {
        flightDao.showDetails();
    }
}
