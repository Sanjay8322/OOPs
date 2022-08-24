package Class;

public class User {
    String name;
    String address;
    int id;
    String pinCode;
    static User user=null;

    public User(String name, String address, int id, String pinCode) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.pinCode = pinCode;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public String getPinCode() {
        return pinCode;
    }
}
