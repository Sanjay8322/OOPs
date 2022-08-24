package Class;

import Exceptions.RestaurantAlreadyExist;
import Exceptions.UserAlreadyExist;
import Service.CustomerServiceExtends;
import Service.RestaurantServiceExtends;

public class Main {
    public static void main(String[] args) throws UserAlreadyExist, RestaurantAlreadyExist {
        User user1=new User("Sanjay","Chennai",1,"621212");
        User user2=new User("JayWon","NA",2,"18181");

        Food food1=new Food("Noodles",100,1);
        Food food2=new Food("Rice",150,2);

        Restaurant restaurant1=new Restaurant("Gupta","India","621212",food1);
        Restaurant restaurant2=new Restaurant("GreenBanana","India","87651",food2);

        CustomerServiceExtends customerService=new CustomerServiceExtends();
        RestaurantServiceExtends restaurantService=new RestaurantServiceExtends();
        customerService.registerUser(user1);
        customerService.registerUser(user2);

        restaurantService.registerRestaurant(restaurant1);
        restaurantService.registerRestaurant(restaurant2);

        restaurantService.showRestaurant();
        restaurantService.orderFood("Gupta");
        System.out.println(restaurantService.getOrderStatus());

        customerService.getCustomerDetails();
    }
}
