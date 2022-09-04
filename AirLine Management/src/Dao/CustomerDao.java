package Dao;

import Classes.Customer;
import Exceptions.CustomerAlreadyExist;
import Exceptions.CustomerNotExist;

import java.util.HashMap;
import java.util.Map;

public class CustomerDao {
    Map<String, Customer> customerMap;

    public CustomerDao(){
        this.customerMap=new HashMap<>();
    }

    public void addCustomer(Customer customer) throws CustomerAlreadyExist{
        if(customerMap.containsKey(customer.getName())){
            throw new CustomerAlreadyExist("Customer already exist");
        }
        customerMap.put(customer.getName(),customer);
    }

    public void removeCustomer(String name) throws CustomerNotExist{
        if(!customerMap.containsKey(name)){
            throw new CustomerNotExist("Customer not exist!");
        }
        customerMap.remove(name);
    }

    public void getCustomerDetails(){
        for(Map.Entry<String,Customer> mp:customerMap.entrySet()){
                System.out.println(mp.getKey()+" "+mp.getValue().getAge()+" "+mp.getValue().getGender()+" "+mp.getValue().getCustomerId());
        }
    }
}
