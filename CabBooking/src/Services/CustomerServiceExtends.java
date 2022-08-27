package Services;

import Classes.Customer;
import Dao.CustomerDao;
import Exceptions.CustomerAlreadyExist;
import Exceptions.NoCustomerFound;

public class CustomerServiceExtends implements CustomerService {
    CustomerDao customerDao;
    public CustomerServiceExtends(){
        customerDao=new CustomerDao();
    }
    @Override
    public void registerCustomer(Customer customer) throws CustomerAlreadyExist {
        customerDao.addCustomer(customer);
        System.out.println("Your account has been registered");
    }

    @Override
    public void deleteAccount(Customer customer) throws NoCustomerFound {
        customerDao.removeCustomer(customer.getName());
        System.out.println("Your account has been removed");
    }

    @Override
    public void showCustomerDetails(String name) {
        customerDao.customerDetails(name);
    }

}
