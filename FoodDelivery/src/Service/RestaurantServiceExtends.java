package Service;

import Dao.RestaurantDao;
import Class.Restaurant;
import Enums.OrderStatus;
import Exceptions.RestaurantAlreadyExist;

public class RestaurantServiceExtends implements RestaurantService{
    RestaurantDao restaurantDao;
    OrderStatus status;
    public RestaurantServiceExtends(){
        this.status=null;
        this.restaurantDao=new RestaurantDao();
    }
    @Override
    public void registerRestaurant(Restaurant restaurant) throws RestaurantAlreadyExist {
        restaurantDao.addRestaurant(restaurant);
    }

    @Override
    public void showRestaurant() {
        restaurantDao.showRestaurants();
    }

    @Override
    public void orderFood(String restaurantName) {
        if(restaurantDao.getRestaurant(restaurantName)){
            status=OrderStatus.Ordered;
        }
    }

    @Override
    public String getOrderStatus() {
        return status.toString();
    }
}
