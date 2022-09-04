package Classes;

import Enums.SeatType;
import Exceptions.CustomerAlreadyExist;
import Exceptions.CustomerNotExist;
import Services.AdminServiceImplements;
import Services.CustomerServiceImplements;

public class Main {
    public static void main(String[] args) throws CustomerAlreadyExist, CustomerNotExist {
        Customer jay=new Customer("Jay",21,"male",1);
        Customer roza=new Customer("Roza",22,"male",2);

        Flight KingFisher=new Flight("KingFisher",1,"India","USA",100);
        Flight SpiceJet=new Flight("SpiceJet",2,"USA","India",200);

        BookFlight bookFlight1=new BookFlight(1,jay,KingFisher,50, SeatType.firstClass);
        BookFlight bookFlight2=new BookFlight(2,roza,SpiceJet,20,SeatType.premium);

        AdminServiceImplements adminService=new AdminServiceImplements();
        CustomerServiceImplements customerService=new CustomerServiceImplements();

        customerService.register(jay);
        customerService.register(roza);

        adminService.addFlight(KingFisher);
        adminService.addFlight(SpiceJet);

        adminService.BookCustomer(1,bookFlight1);
        adminService.BookCustomer(2,bookFlight2);
        adminService.showAllBooking();

//        customerService.removeAccount("Jay");
        customerService.showCustomerDetail();

    }
}
