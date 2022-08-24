package Class;

public class Restaurant {
    String name;
    String address;
    String pinCode;
    Food food;
    public Restaurant(String name, String address, String pinCode,Food food) {
        this.name = name;
        this.address = address;
        this.pinCode = pinCode;
        this.food=food;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPinCode() {
        return pinCode;
    }
}
