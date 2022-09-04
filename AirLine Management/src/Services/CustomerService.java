package Services;

import Classes.Customer;
import Exceptions.CustomerAlreadyExist;
import Exceptions.CustomerNotExist;
import Exceptions.FlightNotAvailable;

public interface CustomerService {
    void register(Customer customer) throws CustomerAlreadyExist;
    void removeAccount(String name) throws CustomerNotExist;
    void showCustomerDetail();
    void searchFlight(String flightName) throws FlightNotAvailable;
    void showFlightDetails();
}
