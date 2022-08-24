package Dao;

import Class.User;
import Exceptions.UserAlreadyExist;
import Exceptions.UserNotExist;

import java.util.HashMap;
import java.util.Map;
public class CustomerDao {
    User currentCustomer;
    Map<String, User> customerMap;
    public CustomerDao(){
        currentCustomer=null;
        customerMap=new HashMap<String, User>();
    }

    public void addUser(User user) throws UserAlreadyExist {
        if(customerMap.containsKey(user.getName())){
            throw new UserAlreadyExist("This user already Exist");
        }
        customerMap.put(user.getName(),user);
    }

    public void removeUser(String userName) throws UserNotExist{
        if(customerMap.containsKey(userName)){
            customerMap.remove(userName);
        }
        else {
            throw new UserNotExist("This user not exist");
        }
    }

    public void setCurrentCustomer(User user){
        this.currentCustomer=user;
    }

    public void getCustomerDetails(){
        for(Map.Entry<String,User> mp:customerMap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue().getAddress());
        }
    }

}
