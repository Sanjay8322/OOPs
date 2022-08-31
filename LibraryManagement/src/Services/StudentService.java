package Services;

import Classes.Student;
import Exceptions.NoUserExist;
import Exceptions.UserAlreadyExist;

public interface StudentService {
    void register(Student student) throws UserAlreadyExist;
    void deleteAccount(Student student) throws NoUserExist;
    void getDetails(int id);
}
