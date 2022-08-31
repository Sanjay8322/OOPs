package Dao;

import Classes.Student;
import Exceptions.NoUserExist;
import Exceptions.UserAlreadyExist;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    Student student;
    Map<Integer, Student> userMap;

    public UserDao(){
        student=new Student();
        this.userMap=new HashMap<>();
    }

    public void addStudent(Student student) throws UserAlreadyExist{
        if(userMap.containsKey(student.getStudentId())){
            throw new UserAlreadyExist("This student already exist!");
        }
        else {
            userMap.put(student.getStudentId(),student);
        }
    }

    public void removeUser(Student student) throws NoUserExist{
        if(userMap.containsKey(student.getStudentId())){
            userMap.remove(student.getStudentId());
        }
        else {
            throw new NoUserExist("This student not exist!");
        }
    }

    public void getStudentDetails(int id){
        if(userMap.containsKey(id)){
            System.out.println(userMap.get(id).getName()+" "+userMap.get(id).getGender());
        }
    }

}
