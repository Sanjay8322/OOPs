package Classes;

public class Admin extends Person {
    int adminId;

    public Admin(String name, int age, String gender, int adminId) {
        super(name, age, gender);
        this.adminId = adminId;
    }


}
