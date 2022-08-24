package Service;
import Class.User;
import Dao.CustomerDao;
import Exceptions.UserAlreadyExist;

public class CustomerServiceExtends implements CustomerService{

    CustomerDao customerDao;

    public CustomerServiceExtends(){
        this.customerDao=new CustomerDao();
    }
    @Override
    public void registerUser(User user) throws UserAlreadyExist {
        customerDao.addUser(user);
    }

    @Override
    public void loginUser(User user) {
        customerDao.setCurrentCustomer(user);
    }

    public void getCustomerDetails(){
        customerDao.getCustomerDetails();
    }
}
