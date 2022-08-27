package Classes;

public class Driver extends User {
    int driverId;
    boolean isLicenseAvailable;
    public Driver(String name, int age, String gender, int driverId) {
        super(name, age, gender);
        this.isLicenseAvailable=false;
        this.driverId = driverId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setLicenseAvailable(boolean licenseAvailable) {
        isLicenseAvailable = licenseAvailable;
    }
}
