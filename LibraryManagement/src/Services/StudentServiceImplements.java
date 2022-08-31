package Services;

import Classes.Student;
import Dao.UserDao;
import Exceptions.NoUserExist;
import Exceptions.UserAlreadyExist;

public class StudentServiceImplements implements StudentService{

    UserDao userDao;

    public StudentServiceImplements(){
        this.userDao=new UserDao();
    }
    @Override
    public void register(Student student) throws UserAlreadyExist {
        userDao.addStudent(student);
        System.out.println("Successfully registered!");
    }

    @Override
    public void deleteAccount(Student student) throws NoUserExist {
        userDao.removeUser(student);
        System.out.println("Account deleted successfully!");
    }

    @Override
    public void getDetails(int id) {
        userDao.getStudentDetails(id);
    }
}
