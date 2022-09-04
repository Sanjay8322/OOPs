package Classes;

public class Flight {
    String flightName;
    int flightNo;
    String from;
    String to;
    int TotalSeats;
    int remainingSeats;
    public Flight(){

    }
    public Flight(String flightName,int flightNo, String from, String to, int totalSeats) {
        this.flightName=flightName;
        this.flightNo = flightNo;
        this.from = from;
        this.to = to;
        TotalSeats = totalSeats;
        this.remainingSeats=0;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getFlightName() {
        return flightName;
    }

    public int getTotalSeats() {
        return TotalSeats;
    }

    public void setRemainingSeats(int seats){
        this.remainingSeats=getTotalSeats()-seats;
    }
}
