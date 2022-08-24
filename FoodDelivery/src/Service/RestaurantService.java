package Service;
import Class.Restaurant;
import Exceptions.RestaurantAlreadyExist;

public interface RestaurantService {
    void registerRestaurant(Restaurant restaurant) throws RestaurantAlreadyExist;
    void showRestaurant();
    void orderFood(String restaurantName);
    String getOrderStatus();
}
