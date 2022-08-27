package Classes;

public class Customer extends User{
    int customerId;

    public Customer(String name, int age, String gender, int customerId) {
        super(name, age, gender);
        this.customerId = customerId;
    }
    public int getCustomerId() {
        return customerId;
    }
}
