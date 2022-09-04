package Dao;

import Classes.Flight;
import Exceptions.FlightNotAvailable;

import java.util.HashMap;
import java.util.Map;

public class FlightDao {
    Map<String, Flight> flightMap;

    public FlightDao(){
        this.flightMap=new HashMap<>();
    }

    public void add(Flight flight){
        flightMap.put(flight.getFlightName(),flight);
    }

    public void remove(String name){
        flightMap.remove(name);
    }

    public void showDetails(){
        for(Map.Entry<String,Flight> flightEntry:flightMap.entrySet()){
            System.out.println(flightEntry.getKey()+" "+flightEntry.getValue().getFrom()+" "+flightEntry.getValue().getTo()+" "+flightEntry.getValue().getTotalSeats());
        }
    }

    public void search(String name) throws FlightNotAvailable{
        if(flightMap.containsKey(name)){
            System.out.println(flightMap.get(name).getFlightName()+" "+flightMap.get(name).getFlightNo()+" "+flightMap.get(name).getFrom()+" "+flightMap.get(name).getTo());
        }
        else{
            throw new FlightNotAvailable("OOPS ! this Flight not available ");
        }
    }
}
