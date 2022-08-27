package Services;

import Classes.Customer;
import Exceptions.CustomerAlreadyExist;
import Exceptions.NoCustomerFound;

public interface CustomerService {

    void registerCustomer(Customer customer) throws CustomerAlreadyExist;
    void deleteAccount(Customer customer) throws NoCustomerFound;
    void showCustomerDetails(String name);
}
