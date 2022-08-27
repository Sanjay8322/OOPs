package Dao;

import Classes.Customer;
import Exceptions.CustomerAlreadyExist;
import Exceptions.NoCustomerFound;

import java.util.HashMap;
import java.util.Map;

public class CustomerDao {
    Map<String, Customer> customerMap;

    public CustomerDao(){
        customerMap=new HashMap<>();
    }

    public void addCustomer(Customer customer) throws CustomerAlreadyExist{
        if(customerMap.containsKey(customer.getName())){
            throw new CustomerAlreadyExist("This customer already exist!");
        }
        customerMap.put(customer.getName(),customer);
    }

    public void removeCustomer(String name) throws NoCustomerFound{
        if(customerMap.containsKey(name)){
            customerMap.remove(name);
        }
        else{
            throw new NoCustomerFound("No customer found with this name!");
        }
    }

    public void customerDetails(String name){
        for(Map.Entry<String,Customer> mp:customerMap.entrySet()){
            if(mp.getKey().equals(name)){
                System.out.println(mp.getKey()+" "+mp.getValue().getCustomerId()+" "+mp.getValue().getGender()+" ");
            }
        }
    }

    public void showCustomers(){
        for (Map.Entry<String,Customer> mp:customerMap.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue().getAge()+" "+mp.getValue().getGender()+" "+mp.getValue().getCustomerId());
        }
    }

}
