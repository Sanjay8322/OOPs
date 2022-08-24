package Service;
import Class.User;
import Exceptions.UserAlreadyExist;

public interface CustomerService {
    void registerUser(User user) throws UserAlreadyExist;
    void loginUser(User user);
}
