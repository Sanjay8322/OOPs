package Dao;

import Class.Restaurant;
import Exceptions.RestaurantAlreadyExist;
import Exceptions.RestaurantNotExist;

import java.util.HashMap;
import java.util.Map;
public class RestaurantDao {
    Map<String, Restaurant> restaurantMap;

    public RestaurantDao(){
        restaurantMap=new HashMap<String, Restaurant>();
    }

    public void addRestaurant(Restaurant restaurant) throws RestaurantAlreadyExist{
        if(restaurantMap.containsKey(restaurant.getName())){
            throw new RestaurantAlreadyExist("This restaurant already exist");
        }
        restaurantMap.put(restaurant.getName(),restaurant);
    }

    public void removeRestaurant(String restaurantName) throws RestaurantNotExist{
        if(restaurantMap.containsKey(restaurantName)){
            restaurantMap.remove(restaurantName);
        }
        else {
            throw new RestaurantNotExist("This restaurant not exist");
        }
    }

    public boolean getRestaurant(String name){
        return restaurantMap.containsKey(name);
    }

    public void showRestaurants(){
        for(Map.Entry<String,Restaurant> mp:restaurantMap.entrySet()){
            System.out.println(mp.getKey()+" ");
        }
    }

}
