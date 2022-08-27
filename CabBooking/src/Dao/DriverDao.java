package Dao;

import Classes.Driver;
import Exceptions.DriverAlreadyExist;
import Exceptions.DriverNotFound;

import java.util.HashMap;
import java.util.Map;

public class DriverDao {
    Map<String, Driver> driverMap;
    public DriverDao(){
        driverMap=new HashMap<>();
    }

    public void addDriver(Driver driver) throws DriverAlreadyExist{
        if(driverMap.containsKey(driver.getName())){
            throw new DriverAlreadyExist("Driver already exist!");
        }
        driverMap.put(driver.getName(),driver);
    }

    public void removeDriver(String name) throws DriverNotFound{
        if(driverMap.containsKey(name)){
            driverMap.remove(name);
        }
        else{
            throw new DriverNotFound("Driver not found!");
        }
    }

    public boolean isDriverAvailable(){
        return driverMap.size() > 0;
    }
}
