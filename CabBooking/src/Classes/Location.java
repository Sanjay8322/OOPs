package Classes;

public class Location {
    int drop;
    String place;
    public Location(){

    }
    public Location( String place, int dropKM) {
        this.drop = dropKM;
        this.place = place;
    }

    public boolean isCabAvailableForLocation(int km){
        return km>30;
    }


    public int getDrop() {
        return drop;
    }

    public String getPlace() {
        return place;
    }
}
